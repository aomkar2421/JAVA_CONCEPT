package om.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {

		Set<Integer> set = new TreeSet<Integer>();

		set.add(67);
		set.add(47);
		set.add(47);
		set.add(33);
		set.add(890);
		set.add(2);

		System.out.println(set);

	}
}
