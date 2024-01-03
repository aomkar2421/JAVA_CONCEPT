package thread;


class Theater2 {
	int total_seats=10;

	public void bookseat(int seats) {

		System.out.println("Hi "+Thread.currentThread().getName());	
		System.out.println("Hi "+Thread.currentThread().getName());
		System.out.println("Hi "+Thread.currentThread().getName());
		System.out.println("Hi "+Thread.currentThread().getName());


		synchronized (this) {

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
		
		System.out.println("Hi "+Thread.currentThread().getName());	
		System.out.println("Hi "+Thread.currentThread().getName());
		System.out.println("Hi "+Thread.currentThread().getName());
		System.out.println("Hi "+Thread.currentThread().getName());

	}
}

public class SynchronizedBlock152 extends Thread {
	static Theater2 t;
	int seats=0;

	public void run() {
		t.bookseat(seats);
	}

	public static void main(String[] args) {
		t=new Theater2();

		SynchronizedBlock152 a1=new SynchronizedBlock152();
		a1.seats=7;
		a1.start();

		SynchronizedBlock152 a2=new SynchronizedBlock152();
		a2.seats=6;
		a2.start();
	}
}
