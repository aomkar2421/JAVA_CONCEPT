package thread;

public class Methods140 extends Thread {
	
public void run() {
	System.out.println("Thread :" + Thread.currentThread().getName());
}
public static void main(String[] args) {
	
	System.out.println(Thread.currentThread().getName());

	Methods140 m1=new Methods140();
	m1.start();
	//m1.setName("Ankita");

	Methods140 m2=new Methods140();
	m2.start();
	m2.setName("nikita");
}
}
