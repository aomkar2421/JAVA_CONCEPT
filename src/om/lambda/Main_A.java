package om.lambda;

public class Main_A implements MathOperations {
	public static void main(String[] args) {
			Main_A main = new Main_A();
			System.out.println(main.doOperation(2, 3));
	}

	@Override
	public int doOperation(int a, int b) {
		return a+b;
	}
}
