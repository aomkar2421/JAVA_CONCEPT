package static_final_super_this;

public class StaticMethod103 {
	public static void main(String[] args) {
		show();
		Demo5.display();
	}

	static void show() {
		System.out.println("Hello");
	}

}


class Demo5 {
	static	void display() {
		System.out.println("World");
	}
}
