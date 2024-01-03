package string;

public class StringUpdate126 {
public static void main(String[] args) {
	String s1="This is table";
	
	System.out.println(s1.replace("is", "was"));
	System.out.println(s1.replaceFirst("is", "was"));
	System.out.println(s1.replaceAll("is", "was"));
	System.out.println(s1.replaceAll("is(.)", "was"));
	System.out.println(s1.replaceAll("is(.*)", "was"));

}
}
