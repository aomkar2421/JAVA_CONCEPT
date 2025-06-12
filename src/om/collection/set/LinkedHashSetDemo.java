package om.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		set.add(67);
		set.add(47);
		set.add(47);
		set.add(33);
		set.add(890);
		set.add(2);
		
		System.out.println(set);
		
	}
}
