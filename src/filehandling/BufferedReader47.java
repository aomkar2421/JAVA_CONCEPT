package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader47 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File file = new File("omkar.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		for (int i = 0; i < file.length(); i++) {
			System.out.print((char) br.read() );
		}
		
	}
}
