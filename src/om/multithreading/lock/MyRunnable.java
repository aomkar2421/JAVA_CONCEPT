package om.multithreading.lock;

public class MyRunnable implements Runnable {
	
	BankAccount account;
	
	public MyRunnable(BankAccount account) {
		this.account = account;
	}

	public MyRunnable() {
	}

	@Override
	public void run() {
		account.withdrawBalance(50);
	}

}
