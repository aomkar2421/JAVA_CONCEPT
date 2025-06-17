package om.multithreading.lock;

public class BankAccount {
	
	int balance = 100;

	synchronized void withdrawBalance(int amount) {
		System.out.println(Thread.currentThread().getName()+" Is trying to withdraw money");
		if (amount <= balance) {
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {}
			
			System.out.println(Thread.currentThread().getName()+" Money withdrawl is in progress");
		}else {
			System.out.println(Thread.currentThread().getName()+" Amount is insufficient");
			System.out.println(Thread.currentThread().getName()+"Trnsaction failed");
			return;
		}
		balance -=amount;
		System.out.println(Thread.currentThread().getName()+" Withdrawl complete");
	}
}