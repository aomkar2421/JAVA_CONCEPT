package thread;

public class Sleep144 extends Thread{
	public  void run() {
		
		try {
			for (int i = 1; i <=5; i++) {
				System.out.println(i+" : "+Thread.currentThread().getName());
				Thread.sleep(1000);
			
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
public static void main(String[] args) {
	SleepDemo143 s1 = new SleepDemo143();
	//s1.run();
	s1.start();
	
	SleepDemo143 s2 = new SleepDemo143();
	//s2.run();
	s2.start();
	
}
}
