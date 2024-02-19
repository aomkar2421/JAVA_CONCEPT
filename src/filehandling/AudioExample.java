package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class AudioExample {
	public static void main(String[] args) throws IOException {
		
		File file = new File("sampleaudio.mp3");
		File file1 = new File("sampleaudio1.mp3");
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file1);
		
		int c1;
		while ((c1 = fis.read()) != -1) {
			fos.write(c1);
		}
		System.out.println(("Operation Completed"));
	}
}
