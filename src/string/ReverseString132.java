package string;

public class ReverseString132 {
public static void main(String[] args) {
	String s1= "madam";
	String rev="";
	for (int i = s1.length()-1; i >=0; i--) {
		rev=rev+s1.charAt(i);
	}
	System.out.println(rev);
	
	if(rev.equals(s1)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");

	}
	
}

}
