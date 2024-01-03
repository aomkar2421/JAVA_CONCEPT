package Abstraction;

 abstract public class Abstract {
 abstract void display();
 
 public static void main(String[] args) {
	Car c=new Car();
	c.display();
}
}

 class Car extends Abstract{

	@Override
	void display() {
		System.out.println("start with key ");
	}
	 
 }
 
 
 