package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyPasteChar {
	public static void main(String[] args) {
		
		try {
			
			File file1 = new File("sampleChar.txt");
			File file2 = new File("xyz.txt");

			FileReader fr = new FileReader(file1);
			FileWriter fw = new FileWriter(file2, true);
			
			int c;
			while ( ( c = fr.read()) != -1 ) {
				fw.write(c);
			}
			fw.flush();
			
			System.out.println("Operation Completed");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
