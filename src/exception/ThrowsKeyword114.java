package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowsKeyword114 {
public static void main(String[] args) {
	
	Demo4 d =new Demo4();
	
	try {
		d.read();
	} 
	
	catch (Exception e) {
		e.printStackTrace();
	}
	
	try {
		d.save();
	} 
	
	catch (Exception e) {
		e.printStackTrace();

	}
}
}


class Demo4 {
	void read() throws FileNotFoundException {
		FileInputStream f =new FileInputStream("d:/abc.txt");
	}
	
	void save() throws FileNotFoundException {
		FileOutputStream f1 =new FileOutputStream("d:/acbc.txt");
	}
}