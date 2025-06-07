package om.lambda;

public class Main_B {
	public static void main(String[] args) {

		MathOperations addOperations = new MathOperations() {
			@Override
			public int doOperation(int a, int b) {
				return a+b;
			}
		};
		System.out.println(addOperations.doOperation(4, 5));
		
		
		
		MathOperations subOperations = new MathOperations() {
			@Override
			public int doOperation(int a, int b) {
				return a-b;
			}
		};
		System.out.println(subOperations.doOperation(4, 5));
		
		
		
		MathOperations multiOperations = new MathOperations() {
			@Override
			public int doOperation(int a, int b) {
				return a*b;
			}
		};
		System.out.println(multiOperations.doOperation(4, 5));
		
		
		
		
		
	}

}
