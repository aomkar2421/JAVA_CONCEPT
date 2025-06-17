package om.multithreading.synchronization;

public class MyThread extends Thread {
	
	Counter counter;
	
	public MyThread(Counter count) {
		counter = count;
	}

	public MyThread() {
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			counter.increment();
		}
	}
	
}
