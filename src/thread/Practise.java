package thread;

class Demo extends Thread{
	public void run() {
		while (true) {
			System.out.println("ankita");
		}
	}
}

class Demo1 extends Thread{
	public void run() {
		while (true) {
			System.out.println("omkar");
		}
	}
}

public class Practise {
	public static void main(String[] args) {
			Demo d1 = new Demo();
			Demo1 d2 = new Demo1();
			
			d1.start();
			d2.start();
	}
}
