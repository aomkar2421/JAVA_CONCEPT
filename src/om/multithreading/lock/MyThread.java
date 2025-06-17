package om.multithreading.lock;

public class MyThread extends Thread {
	
	BankAccount account;
	
	public MyThread(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.withdrawBalance(50);
	}
	
}
