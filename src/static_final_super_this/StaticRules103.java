package static_final_super_this;

public class StaticRules103 {
	static int a=10;
	
	static void show() {
		//System.out.println(this.a);//cannot use this
		display();
		System.out.println(a);
	}
	
	static void display() {
		System.out.println("abc");
	}
	
public static void main(String[] args) {
	show();
}


}
