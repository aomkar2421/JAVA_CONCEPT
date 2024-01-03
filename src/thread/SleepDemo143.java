package thread;

public class SleepDemo143 extends Thread{
	public  void run() {
		
		try {
			for (int i = 1; i <=5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			//	Thread.sleep(1000, 99999999);
			//	Thread.sleep(-1);

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
public static void main(String[] args) {
	SleepDemo143 s = new SleepDemo143();
	s.start();
}
}
