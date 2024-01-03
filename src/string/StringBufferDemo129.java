package string;

public class StringBufferDemo129 {
public static void main(String[] args) {
	
	StringBuffer sb=new StringBuffer("Ignited Minds");
//	System.out.println(sb.capacity());
//	System.out.println(sb.length());
//
//	System.out.println(sb.charAt(4));
//	System.out.println(sb.indexOf("t"));
//	System.out.println(sb.replace(2, 6, "moss"));
//	System.out.println(sb.lastIndexOf("i"));
//	System.out.println(sb.append("Heart"));
//	System.out.println(sb.delete(9, 14));
	System.out.println(sb.insert(9, "heart"));
	System.out.println(sb.substring(5));
	System.out.println(sb.subSequence(5, 9));
	
}

}
