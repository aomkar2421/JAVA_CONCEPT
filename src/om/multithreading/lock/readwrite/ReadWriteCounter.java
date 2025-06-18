package om.multithreading.lock.readwrite;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {
		
	ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

	Lock readLock = readWriteLock.readLock();

	Lock writeLock = readWriteLock.writeLock();

	int count = 0;

	void increment() {
		readLock.lock();
		try {
			count++;
		} finally {
			readLock.unlock();
		}
	}

	int getCount() {
		readLock.lock();
		try {
			return count;
		} finally {
			readLock.unlock();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		ReadWriteCounter counter = new ReadWriteCounter();

		Runnable writeTask = new Runnable() {	
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					counter.increment();
					System.out.println(Thread.currentThread().getName()+" Incremented");
				}
			}
		};

		
		Runnable readTask = new Runnable() {	
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					
					System.out.println(Thread.currentThread().getName()+" count : "+counter.getCount());
				}
			}
		};

		Thread writerThred = new Thread(writeTask);
		Thread writerThred1 = new Thread(writeTask);
		Thread readerThred1 = new Thread(readTask);
		Thread readerThred2 = new Thread(readTask);
		
		writerThred.start();
		writerThred1.start();
		readerThred1.start();
		readerThred2.start();

		writerThred.join();
		writerThred1.join();
		readerThred1.join();
		readerThred2.join();
		
		System.out.println("final count "+counter.getCount());

	}

}