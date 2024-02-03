package telusko;

class Calculator {
	int sum ;
	void add(int a, int b) {
		sum = a + b;
	}

	void display() {
		System.out.println(sum);
	}
}

public class Main {
	public static void main(String[] args) {

		new Calculator().add(5, 3);

		new Calculator().display();

	}
}
