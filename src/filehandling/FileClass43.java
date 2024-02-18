package filehandling;

import java.io.File;

public class FileClass43 {
	public static void main(String[] args) {
		String path1 = "D:/Utilities/Files/abc.txt";
		String path2 = "abc.txt";

		File file = new File(path2);
		System.out.println(file.exists());
		System.out.println(file.getName());
	}
}