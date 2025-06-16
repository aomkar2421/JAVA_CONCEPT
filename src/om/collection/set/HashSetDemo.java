package om.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(67);
		set.add(47);
		set.add(47);
		set.add(33);
		set.add(890);
		set.add(2);
		
		System.out.println(set);
	}
}
