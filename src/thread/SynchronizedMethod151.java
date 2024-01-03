package thread;


class Theater1 {
	int total_seats=10;

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

public class SynchronizedMethod151 extends Thread {
	static Theater1 t;
	int seats=0;
	
	public void run() {
		t.bookseat(seats);
	}

	public static void main(String[] args) {
		t=new Theater1();
		
		SynchronizedMethod151 a1=new SynchronizedMethod151();
		a1.seats=7;
		a1.start();
		
		SynchronizedMethod151 a2=new SynchronizedMethod151();
		a2.seats=6;
		a2.start();
	}
}
