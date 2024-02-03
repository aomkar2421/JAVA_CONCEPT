package telusko;

import java.io.*;

class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

public class SerializationExample {
	public static void main(String[] args) throws Exception {

		Student student = new Student("Alice", 20);

		FileOutputStream fileOut = new FileOutputStream("student.ser");
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

		objectOut.writeObject(student);
		System.out.println("Serialization complete - Student object saved to student.ser");

		FileInputStream fileIn = new FileInputStream("student.ser");
		ObjectInputStream objectIn = new ObjectInputStream(fileIn);

		Student deserializedStudent = (Student) objectIn.readObject();
		System.out.println("Deserialization complete - Student object retrieved:");
		deserializedStudent.display();

	}
}