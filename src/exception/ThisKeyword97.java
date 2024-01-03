package exception;

public class ThisKeyword97 {
public static void main(String[] args) {
	Test t =new Test();
	t.set(20);
	t.display();
}
}

class Test{
	int i;
	
	void set(int i) {
		this.i=i;
	}
	
	void display() {
		System.out.println(i);
	}
}

