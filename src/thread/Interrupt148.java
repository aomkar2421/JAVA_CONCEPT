package thread;

public class Interrupt148 extends Thread {
	public void run() {
		
			try {
				for (int i = 1; i <=5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
public static void main(String[] args) {
	Interrupt148 i =new Interrupt148();
	i.start();
	i.interrupt();
}
}
