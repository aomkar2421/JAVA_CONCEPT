package filehandling;

import java.io.InputStreamReader;

public class INStreamReader {
	public static void main(String[] args) {
		
		try {
			
			InputStreamReader isr = new InputStreamReader(System.in);
			System.out.println("Enter something");
			String a = isr.getEncoding();
			
			while (isr.ready()) {
				System.out.println( a);
				a = isr.getEncoding();
			}
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
