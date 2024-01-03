package exception;

import java.util.Scanner;

class YoungerAgeException extends RuntimeException{
	
	YoungerAgeException(String msg){
		super(msg);
	}
}

public class ThrowKeyword113 {
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter age:");
	int age=sc.nextInt();
	
	if (age<18) {
		throw new YoungerAgeException("Not eligible for voting");
		
	} else {
		System.out.println("success");
	}
	
}

}
