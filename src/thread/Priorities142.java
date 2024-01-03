package thread;

public class Priorities142 extends Thread{
public void run() {
	System.out.println("child Priority:"+Thread.currentThread().getPriority());
}

public static void main(String[] args) {
	System.out.println("main Priority:"+Thread.currentThread().getPriority());
	
	Priorities142 p=new Priorities142();
	//p.setPriority(12);
	p.start();
}
}
