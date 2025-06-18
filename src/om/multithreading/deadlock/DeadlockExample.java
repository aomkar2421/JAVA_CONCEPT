package om.multithreading.deadlock;

class Pen{
	synchronized void writeWithPenAndPaper(Paper paper) {
		System.out.println(Thread.currentThread().getName()+" is using pen "+this+" and trying to write paper");
		paper.finishedWriting();;
	}
	
	synchronized void finishedWriting() {
		System.out.println(Thread.currentThread().getName()+" Finished writing");
	}
}

class Paper{
	synchronized void writeWithPaperAndPen(Pen pen) {
		System.out.println(Thread.currentThread().getName()+" is using paper "+this+" and trying to write paper");
		 pen.finishedWriting();
	}
	
	synchronized void finishedWriting() {
		System.out.println(Thread.currentThread().getName()+" Finished writing");
	}
}

class Task1 implements Runnable{
	
	Pen pen;
	Paper paper;
	
	public Task1(Pen pen, Paper paper) {
		this.pen = pen;
		this.paper = paper;
	}

	@Override
	public void run() {
		synchronized (paper) {
			pen.writeWithPenAndPaper(paper);
		}
	}
	
}

class Task2 implements Runnable{
	
	Pen pen;
	Paper paper;
	
	public Task2(Pen pen, Paper paper) {
		this.pen = pen;
		this.paper = paper;
	}

	@Override
	public void run() {
		paper.writeWithPaperAndPen(pen);
	}
	
}

public class DeadlockExample {
	public static void main(String[] args) {
		
		Pen pen = new Pen();
		Paper paper = new Paper();
		
		Thread t1 = new Thread(new Task1(pen, paper), "Thread 1");
		Thread t2 = new Thread(new Task2(pen, paper), "Thread 2");
		
		t1.start();
		t2.start();
	}
}
