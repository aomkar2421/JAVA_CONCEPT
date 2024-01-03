package thread;

public class DaemonThread141 extends Thread{
	
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");

		}else {
			System.out.println(" child Thread");
		}
	}
	
public static void main(String[] args) {
	System.out.println("main thread");
	
	DaemonThread141 d1=new DaemonThread141();
	d1.setDaemon(true);
	d1.start();
}
}
