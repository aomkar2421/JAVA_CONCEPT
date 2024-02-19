package filehandling;

import java.io.File;
import java.io.IOException;

public class FileClass43 {
	public static void main(String[] args) throws IOException {
		String path1 = "D:/Utilities/Files/omkar.txt";
		String path2 = "omkar.txt";
		String path3 = "om.txt";

		File file = new File(path3);
		file.createNewFile();
		System.out.println(file.exists());
		System.out.println(file.getName());
		
		File file2 = new File(path3);
		file2.delete();
	}
}