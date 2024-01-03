package polymorphism;
 
//public class MethodOverloading {
//
//void show() {
//	System.out.println("1");
//}
//
//void show() {
//	System.out.println("2");
//}
//
//public static void main(String[] args) {
//	MethodOverloading m=new MethodOverloading();
//	m.show();                    //Compiler confuse which method he has to call(Ambiguity error)
//}
//}




//public class MethodOverloading {
//
//void show(int a) {
//	System.out.println("1");
//}
//
//void show(String b) {
//	System.out.println("2");
//}
//
//public static void main(String[] args) {
//	MethodOverloading m=new MethodOverloading();
//	m.show(10);          
//}
//}


//public class MethodOverloading {
//
//String show(int a) {
//	System.out.println("1"); 
//}
//
//void show() {                          //when we change datatype it shows compile time error
//	System.out.println("2");
//}
//
//public static void main(String[] args) {
//	MethodOverloading m=new MethodOverloading();
//	m.show();          //Compiler confuse which method he has to call(Ambiguity error)
//}
//}



//public class MethodOverloading{
//	public static void main(String[] args) {
//		System.out.println("11");
//		MethodOverloading m=new MethodOverloading();
//		m.main(23);
//
//	}
//	
//	public static void main(int a) {
//		System.out.println("32");
//	}
//	
//}


/*---------------------------Case 1--------------------------------------------------------*/

//public class MethodOverloading {
//
//void show(int a) {
//	System.out.println("1");
//}
//
//void show(String b) {
//	System.out.println("asdfg");
//}
//
//public static void main(String[] args) {
//	MethodOverloading m=new MethodOverloading();
//	m.show('a');          //output =1; because of Automatic Promotion(character is convert into integer)
//}
//}

/*---------------------------Case 2--------------------------------------------------------*/


//public class MethodOverloading {
//
//void show(Object a) {
//	System.out.println("1");
//}
//
//void show(String b) {
//	System.out.println("2");
//}
//
//public static void main(String[] args) {
//	MethodOverloading m=new MethodOverloading();
//	m.show("asd");          //Object is a parent of string but while resolving overloaded methods compiler gives precedence to child class
//}
//}



//public class MethodOverloading {
//
//void show(String a) {
//	System.out.println("Inside String");
//}
//
//void show(StringBuffer b) {
//	System.out.println("Inside StringBuffer");
//}
//
//public static void main(String[] args) {
//	MethodOverloading m=new MethodOverloading();
//	m.show("asd");  
//	m.show(new StringBuffer("sdfghj"));
//	m.show("null");
//
//}
//}



//public class MethodOverloading {
//
//void show(int a) {
//	System.out.println("Int method");
//}
//
//void show(int... b) {
//	System.out.println("Varargs method");
//}
//
//public static void main(String[] args) {
//	MethodOverloading m=new MethodOverloading();
//	m.show(10,20); 
//	m.show();            //if no other  method is matched then only vararg method call
//}
//}