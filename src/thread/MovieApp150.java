package thread;


class Theater {
	int total_seats=10;

	public void bookseat(int seats) {

		if (total_seats>=seats) {
			System.out.println(seats+"Book successful");
			total_seats=total_seats-seats;
			System.out.println("Seats Left "+total_seats);
		}

		else {
			System.out.println("not booked");
		}
	}
}

public class MovieApp150 extends Thread {
	static Theater t;
	int seats=0;
	
	public void run() {
		t.bookseat(seats);
	}

	public static void main(String[] args) {
		t=new Theater();
		
		MovieApp150 a1=new MovieApp150();
		a1.seats=7;
		a1.start();
		
		MovieApp150 a2=new MovieApp150();
		a2.seats=6;
		a2.start();
	}
}
