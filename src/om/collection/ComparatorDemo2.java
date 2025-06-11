package om.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import om.collection.map.Student;

public class ComparatorDemo2 {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();

		Student s1 = new Student("om", 9.7);
		Student s2 = new Student("nana", 8.6);
		Student s3 = new Student("avi", 9.7);
		Student s4 = new Student("appa", 9.9);
		Student s5 = new Student("aai", 9.3);
		Student s6 = new Student("ankita", 8.6);

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);

		System.out.println("ORIGINAL");
		for (Student student : list) {
			System.out.println(student.getName()+"  "+student.getCgpa());
		}

		list.sort( (o1, o2) -> {

			if (o1.getCgpa()-o2.getCgpa() > 0) {
				return 1;
			}
			else if (o1.getCgpa()-o2.getCgpa() < 0) {
				return -1;
			}
			else {
				// to sort records with same name
				return o1.getName().compareTo(o2.getName());
				//				return 0;
			}

		} );

		System.out.println("\nSORTED ASC");
		for (Student student : list) {
			System.out.println(student.getName()+"  "+student.getCgpa());
		}



		list.sort( (o2, o1) -> {

			if (o1.getCgpa()-o2.getCgpa() > 0) {
				return 1;
			}
			else if (o1.getCgpa()-o2.getCgpa() < 0) {
				return -1;
			}
			else {
				// to sort records with same name
//				return o1.getName().compareTo(o2.getName());
								return 0;
			}

		} );

		System.out.println("\nSORTED DESC");
		for (Student student : list) {
			System.out.println(student.getName()+"  "+student.getCgpa());
		}

		
		
		System.out.println("\nUSING COMPARING JAVA 8");
		
		Comparator<Student> comparing = Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName);
		list.sort(comparing);
		for (Student student : list) {
			System.out.println(student.getName()+"  "+student.getCgpa());
		}

	}
}
