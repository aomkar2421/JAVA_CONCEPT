package exception;

public class FinalException110 {
public static void main(String[] args) {
/*	try {
		int a=20,b=0,c;
		c=a/b;
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}finally {
		System.out.println("final block");
	}


*/
	
	try {
		int a=20,b=2,c;
		c=a/b;
		System.out.println(c);
	}
	finally {
		
		System.out.println("final block");
	}
}	
}