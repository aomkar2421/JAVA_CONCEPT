package thread;

public class JoinDemo146 extends Thread {
	public void run() {
		
		try {
			join();
			for (int i = 1; i <=5; i++) {
				System.out.println(Thread.currentThread().getName()+" : "+i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		Thread MyThread = Thread.currentThread();
	
		JoinDemo146 j=new JoinDemo146();
		j.start();
		
			try {
//				j.join();

				for (int i = 6; i <=10; i++) {
				System.out.println(Thread.currentThread().getName()+" : "+i);
				Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	


