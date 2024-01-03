package exception;

public class Exception1 {
public static void main(String[] args) {
	try {
		int a=10,b=0,c;
		
		c=a/b;
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		System.out.println(e);
		System.out.println(e.toString());
		System.out.println(e.getMessage());
	}
}
}
