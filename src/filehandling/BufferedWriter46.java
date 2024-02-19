package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter46 {
	public static void main(String[] args) throws IOException {
		
		File file = new File("Omkar.txt");
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String s = " Omkar Sanjay Jagtap";
		bw.write(s);
		
		bw.close();
		fw.close();
		System.out.println("Operation Completed");
	}
}
