package om.lambda;

public class Main_C {
	public static void main(String[] args) {
		
		MathOperations operation1 =  (int a, int b)-> {
			return a+b;
		};
		System.out.println(operation1.doOperation(6, 4));	
		
		
		MathOperations operation2 = (a,b)->a+b;
		System.out.println(operation2.doOperation(6, 4));		
		
		MathOperations operation3 = Main_C::add;
		System.out.println(operation3.doOperation(6, 4));
		
	}
	
	static int add(int a, int b) {
		return a+b;
	}

}
