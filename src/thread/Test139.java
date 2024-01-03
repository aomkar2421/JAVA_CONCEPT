package thread;

public class Test139 extends Thread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		Test139 t1= new Test139();
		t1.start();


	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Shubra");
		System.out.println(Thread.currentThread().getName());

	}
}
