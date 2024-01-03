package thread;

public class Yield145  extends Thread{
public void run() {
	for (int i = 1; i <=5; i++) {
		Thread.yield(); 

		System.out.println(Thread.currentThread().getName()+" : "+i);

	}
}

public static void main(String[] args) {
	Yield145 y =new Yield145();
	y.start();
	
	//Thread.yield(); //if you want to stop main method and provide chance to other thread
	
	for (int i = 1; i <=5; i++) {
		System.out.println(Thread.currentThread().getName()+" : "+i);

	}

}

}
