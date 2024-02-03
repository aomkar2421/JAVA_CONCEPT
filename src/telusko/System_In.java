package telusko;

import java.io.IOException;

public class System_In {
	public static void main(String[] args) throws IOException {
		
		int a = System.in.read();
		System.out.println((char) a);
		
		
		String string = null ;
		while (( a = System.in.read()) != 48) {
			string = string + (char) a;
		}
		
		System.out.println(string);
	}
}
