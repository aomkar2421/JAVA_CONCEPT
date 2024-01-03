// package thread;
//// case 1 performing single task from single thread
//public class Multithreading138 extends Thread{
//	public void run() {
//		System.out.println("thread");
//	}
//
//	public static void main(String[] args) {
//		Multithreading138 m1=new Multithreading138();
//		m1.start();
//	}
//}


//package thread;
////case 2  performing single task from multiple thread
//public class Multithreading138 extends Thread{
//	public void run() {
//		System.out.println("thread");
//	}
//
//	public static void main(String[] args) {
//		Multithreading138 m1=new Multithreading138();
//		m1.start();
//		
//		Multithreading138 m2=new Multithreading138();
//		m2.start();
//	}
//}


package thread;
//case 4  performing multiple task from multiple thread

class MyThread extends Thread{
	public void run() {
		System.out.println("thread 1");
	}
}	

public class Multithreading138 extends Thread{
	public void run() {
		System.out.println("thread 2");
	}

	public static void main(String[] args) {
		Multithreading138 m1=new Multithreading138();
		m1.start();

		MyThread m2=new MyThread();
		m2.start();
	}
}


