package Abstraction;

 interface I1 {
void show();
}

class Test implements I1{

	@Override
	public void show() {
		System.out.println("1");
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.show();
	}
}
