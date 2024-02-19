package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileOutput44 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("ankita.txt");
		FileOutputStream fos = new FileOutputStream(f,true);
		String a = "Be Happy With Omkar";
		
		char [] ch = a.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			fos.write(ch[i]);
		}
		fos.close();
		System.out.println("Operation Completed");
	}
}
