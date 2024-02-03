package telusko;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FH1 {
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("demo.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("omkar marries ankita . a happy ending?");

		String currentDir = System.getProperty("user.dir");
		System.out.println("Current Directory: " + currentDir);

		FileInputStream fis = new FileInputStream("demo.txt");
		DataInputStream dis = new DataInputStream(fis);
		String a = dis.readUTF();
		System.out.println(a);

	}
}
