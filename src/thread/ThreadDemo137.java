package thread;

public class ThreadDemo137 implements Runnable{
	@Override
	public void run() {
		System.out.println(" Runnable thread");
	}

	public static void main(String[] args) {
		ThreadDemo137 t1=new ThreadDemo137();
		Thread t=new Thread(t1);
		t.start();
	}
}
