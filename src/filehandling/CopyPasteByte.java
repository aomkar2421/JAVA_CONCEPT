package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPasteByte {
	public static void main(String[] args) throws IOException {
		
		File file1 = new File("sample.txt");
		File file2 = new File("sample2.txt");

		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(file2, true);
		
		int c;
		while ( ( c = fis.read()) != -1 ) {
			fos.write(c);
		}
		System.out.println("Operation Completed");
	}
}
