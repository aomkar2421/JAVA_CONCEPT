package om.multithreading.lock;

public class Main {
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		Runnable runnable = new Runnable() {		
			@Override
			public void run() {
				account.withdrawBalance(50);
			}
		};
		
		Thread t1 = new Thread( runnable ,"Thread 1");
		Thread t2 = new Thread( runnable ,"Thread 2");
		
		t1.start();
		t2.start();
		
//		MyThread t1 = new MyThread(account);
//		MyThread t2 = new MyThread(account);
//		
//		t1.start();
//		t2.start();
		
		
//		MyRunnable runnable = new MyRunnable(account);
//		
//		Thread t1 = new Thread(runnable, "Thread1");
//		Thread t2 = new Thread(runnable, "Thread2");
//		
//		t1.start();
//		t2.start();
	}
}
