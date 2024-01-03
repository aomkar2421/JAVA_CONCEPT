package static_final_super_this;
/*
public class UseThisKeyword98 {
public static void main(String[] args) {
	UseThisKeyword98 t =new UseThisKeyword98();
	t.show();
}

void display() {
	System.out.println("hii");
}

void show() {
	this.display();
	System.out.println("hello");
}
}


public class UseThisKeyword98{
	public static void main(String[] args) {
		UseThisKeyword98 t =new UseThisKeyword98();

	}

	UseThisKeyword98(){
		this(10);
	}

	UseThisKeyword98(int a){
		System.out.println("cons");

	}
}


public class UseThisKeyword98 {
public static void main(String[] args) {
	UseThisKeyword98 t =new UseThisKeyword98();
	t.show();
}

void display(UseThisKeyword98 t) {
	System.out.println("hii");
}

void show() {
	display(this);
}
}


public class UseThisKeyword98{
	public static void main(String[] args) {
		UseThisKeyword98 d =new  UseThisKeyword98();

		d.m1();
	}

	void m1(){
		Demo t =new  Demo(this);
	}

}

class Demo{
	Demo(UseThisKeyword98 d) {
		System.out.println("demo class");
	}
}

*/

public class UseThisKeyword98{
	public static void main(String[] args) {
		UseThisKeyword98 d =new  UseThisKeyword98();

		d.m1();
	}

	UseThisKeyword98 m1(){
		return this;
	}

}