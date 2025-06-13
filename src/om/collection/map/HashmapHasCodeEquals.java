package om.collection.map;

import java.util.HashMap;
import java.util.Objects;

public class HashmapHasCodeEquals {
	public static void main(String[] args) {
		
		HashMap<Person, String> map = new HashMap<Person, String>();
		Person p1 = new Person("om", 1);
		Person p2 = new Person("avi", 2);
		Person p3 = new Person("om", 1);
		
		map.put(p1, "Team Lead");
		map.put(p2, "Manager");
		map.put(p3, "Manager");
		
		System.out.println(map.size());
		System.out.println(map.get(p1));
		System.out.println(map.get(p3));
		
		
		
	}
}

class Person{
	
	String name;
	
	int id;

	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		else if (obj == null) {
			return false;
		}
		else if (getClass() != obj.getClass()) {
			return false;
		}
		
		Person currPerson = (Person) obj;
		return id == currPerson.id && Objects.equals(name, currPerson.name);

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
}