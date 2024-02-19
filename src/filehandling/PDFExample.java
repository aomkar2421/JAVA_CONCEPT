package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class PDFExample {
	public static void main(String[] args) throws IOException {
		
		File file = new File("sample.pdf");
		File file1 = new File("sample1.pdf");
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file1);
		
		int c1;
		while ((c1 = fis.read()) != -1) {
			fos.write(c1);
		}
		System.out.println(("Operation Completed"));
	}
}
