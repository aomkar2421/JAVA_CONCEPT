package thread;


class BookTheaterShow {
	static int total_seats=20;

	synchronized void bookseat(int seats) {

		if (total_seats>=seats) {
			System.out.println(seats+" Seats Book successful");
			total_seats=total_seats-seats;
			System.out.println("Seats Left "+total_seats);
		}

		else {
			System.out.println("Sorry! Seat are not booked");
			System.out.println("Seats Left "+total_seats);
		}
	}
}

class MyThread1 extends Thread {
	
	BookTheaterShow b;
	int seats;

	MyThread1(BookTheaterShow b,int seats ){
		this.b=b;
		this.seats=seats;
	}

	public void run(int seats) {
		b.bookseat(seats);
	}
}

class MyThread2 extends Thread {
	BookTheaterShow b;
	int seats;

	MyThread2(BookTheaterShow b,int seats ){
		this.b=b;
		this.seats=seats;
	}

	public void run(int seats) {
		b.bookseat(seats);
	}
}

public class StaticSynchronization153  {


	public static void main(String[] args) {

		BookTheaterShow t1=new BookTheaterShow();
		
		MyThread2 m1=new MyThread2(t1,4);
		m1.start();

		MyThread2 m2=new MyThread2(t1,8);
		m2.start();

		BookTheaterShow t2=new BookTheaterShow();
		
		MyThread1 m3=new MyThread1(t2,8);
		m3.start();
		
		MyThread2 m4=new MyThread2(t2,5);
		m4.start();

	}


}
