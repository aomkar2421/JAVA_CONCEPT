package telusko;

//Class A
class A {
 void show() {
     System.out.println("Inside A's show method");
 }
}

//Class B inherits from A
class B extends A {
 void show() {
     System.out.println("Inside B's show method");
 }
}

public class DynamicMethod {
 public static void main(String[] args) {
     A objA = new A(); 
     B objB = new B(); 
     
     A ref;
//     ref.show();
     
     ref = objA; // 'ref' refers to object of type A
     ref.show(); // Calls show method of class A

     ref = objB; // 'ref' now refers to object of type B
     ref.show(); // Calls show method of class B (due to dynamic method dispatch)
 }
}
