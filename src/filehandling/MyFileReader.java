package filehandling;

import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sample.txt");
            
            System.out.println("File content:");

            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }

            System.out.println("\nDone");

            fr.close(); // It's good practice to close the FileReader when done
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
