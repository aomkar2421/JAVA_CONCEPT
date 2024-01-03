package static_final_super_this;

public class Static102 {
 static int a=20;

 void b2() {
	 int b= 30;//can not declare static
 }
 
 public static void main(String[] args) {
	System.out.println(Test5.d);
}
}

  class Test5 {
	static int d =15;
}
