package om.collection;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student("om", 9.7);
		Student s2 = new Student("nana", 9.7);
		Student s3 = new Student("avi", 9.4);
		Student s4 = new Student("appa", 9.9);
		Student s5 = new Student("aai", 9.5);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		System.out.println(list);
		list.sort(null);
		System.out.println(list);
		
	}
}
