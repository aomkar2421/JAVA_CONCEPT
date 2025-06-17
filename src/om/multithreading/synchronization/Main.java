package om.multithreading.synchronization;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		Counter count = new Counter();
		
		MyThread t1 = new MyThread(count);
		MyThread t2 = new MyThread(count);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(count.getCount());
	}
}
