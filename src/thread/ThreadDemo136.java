package thread;

public class ThreadDemo136 extends Thread{
	@Override
	public void run() {
		System.out.println("thread");
	}

	public static void main(String[] args) {
		ThreadDemo136 t1=new ThreadDemo136();
		t1.start();
	}
}
