package thread;

public class IsInterrupt149 extends Thread {
	public void run() {
		System.out.println(Thread.interrupted());
		System.out.println(Thread.interrupted());
	//	System.out.println(Thread.currentThread().isInterrupted());
	//	System.out.println(Thread.currentThread().isInterrupted());

			
		try {
				for (int i = 1; i <=5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			//	System.out.println("A1"+Thread.interrupted());

				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
public static void main(String[] args) {
	IsInterrupt149 i =new IsInterrupt149();
	i.start();
	i.interrupt();
}
}
