package static_final_super_this;
/*
public class Super99 extends Demo {
public static void main(String[] args) {
	Super99  s =new Super99();
	s.show(30);


}
int a=15;

 void show( int a) {
	 super.display();
	 System.out.println(a);
	 System.out.println(this.a);
	 System.out.println(super.a);
 }

}

class Demo{
	int a=20;

	void display() {
		System.out.println("Anki");
	}
}
 */

public class Super99 extends Demo {

	Super99(){
		System.out.println("super99");
	}

	public static void main(String[] args) {
		Super99  s =new Super99();



	}
}
class Demo{
	public Demo() {
		System.out.println("Demo");
	}
}