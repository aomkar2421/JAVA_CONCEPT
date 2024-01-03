package string;

public class StringMethod125 {
public static void main(String[] args) {
	String s1= "Ankita";
	String s2="Jagtap";
	
	System.out.println(s1+10);
	System.out.println(s1+10+20);
	System.out.println(10+20+s1);
	System.out.println(10+s1+20);
	System.out.println(s1+20/10);
	System.out.println(s1.concat(s2));
	System.out.println(String.join(";", s1,s2));
	
	String s3= "Ankita jagtap";
	System.out.println(s3.subSequence(3, 9));
	System.out.println(s3.substring(5));

	
	
}
}
