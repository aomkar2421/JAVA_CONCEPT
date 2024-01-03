package polymorphism;

//class Text{
//	
//	void show() {
//		System.out.println("1");
//	}
//}
//public class MethodOverriding  extends Text{
//
//	void show() {
//		System.out.println("2");
//	}
//	
//	public static void main(String[] args) {
//		
//		MethodOverriding m=new MethodOverriding();
//		m.show();              //2
//		
//		Text t=new Text();
//		t.show();              //1
//	}
//	
//	
//}



//class Text{
//	//it is possible to have different return type for overriding methods
//	Object show() {
//		System.out.println("1");
//		return null;
//	}
//}
//public class MethodOverriding  extends Text{
//
//	String show() {
//		System.out.println("asdfg");
//		return null;
//	}
//	
//	public static void main(String[] args) {
//		
//		MethodOverriding m=new MethodOverriding();
//		m.show();              		
//		Text t=new Text();
//		t.show();              
//	}
//	
//	
//}



//class Text{
//	
//	void show() {
//		System.out.println("1");
//	}
//}
//public class MethodOverriding  extends Text{
//
//	void show() {
//		super.show();       //  without writing object of  parent class for accessing methods  super keyword is use
//		System.out.println("2");
//	}
//	
//	public static void main(String[] args) {
//		
//		MethodOverriding m=new MethodOverriding();
//		m.show();              
//		
//		
//	}
//	
//	
//}




//class Text{
//	
//	void show() {
//		System.out.println("1");
//	}
//}
//public class MethodOverriding  extends Text{
//
//	public show() {             // Always child class accessiblity is more than parent class
//		System.out.println("2");
//	}
//	
//	public static void main(String[] args) {
//		
//		MethodOverriding m=new MethodOverriding();
//		m.show();              	
//	}
//}

/*----------------------------Exception Handling ------------------------------*/

//class Text{
//	
//	void show() {
//		System.out.println("1");
//	}
//}
//public class MethodOverriding  extends Text{
//
//	void show()throws ArithmeticException {             
//		System.out.println("2");
//	}
//	
//	public static void main(String[] args) {
//		
//		MethodOverriding m=new MethodOverriding();
//		m.show(); 
//		
//		Text t=new Text();
//		t.show();
//	}
//}



//class Text{
//	
//	void show() throws ArithmeticException{
//		System.out.println("1");
//	}
//}
//   public class MethodOverriding  extends Text{
//
//	void show()throws Exception {             
//		System.out.println("2");
//	}
//	
//	public static void main(String[] args) {
//		
//		MethodOverriding m=new MethodOverriding();
//		m.show(); 
//		
//		Text t=new Text();
//		t.show();
//	}
//}


 abstract class Text{
	 abstract void display();
	
	void show() {
		System.out.println("1");
	}
 }
    public class MethodOverriding  extends Text{
void display() {
	System.out.println("abstact method");
}
	void show(){             
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		
		MethodOverriding m=new MethodOverriding();
		m.show(); 
		
		
	}
}



