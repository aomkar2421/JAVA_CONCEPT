package om.collection;

public class Student implements Comparable<Student> {
	String name;
	double cgpa;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getCgpa() {
		return cgpa;
	}
	
	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}
	
	public Student(String name, Double cgpa) {
		super();
		this.name = name;
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", cgpa=" + cgpa + "]";
	}

	@Override
	public int compareTo(Student o) {
		return Double.compare(o.getCgpa(), this.getCgpa());
	}
}