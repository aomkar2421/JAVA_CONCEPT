package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput45 {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		File file = new File("ankita.txt");
		FileInputStream fis = new FileInputStream(file);


		int c1;
		
		while ((c1 = fis.read()) != -1) {
			System.out.print( (char) c1);
		}


		fis.close();
	}
}
