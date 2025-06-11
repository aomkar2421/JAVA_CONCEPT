package om.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(7,9,54,3,65,21,67,5,76);
		System.out.println("Original nums : "+nums);

		nums.sort(null);
		System.out.println("Asc sort");
		System.out.println(nums);

		System.out.println("USING COMPARTOR");

//		nums.sort(new NumberComparatorDesc());
		nums.sort( (a,b) -> b-a  );
		System.out.println("DESC : "+nums);

//		nums.sort(new NumberComparatorAsc());
		nums.sort( (a,b) -> a-b  );
		System.out.println("ASC : "+nums);



		List<String> names = Arrays.asList("om", "avi", "appa", "aai", "ankita");
		System.out.println("\nOriginal names : "+names);

		names.sort(null);
		System.out.println(names);

		System.out.println("SORTING ALPHABETICALLY USING COMPARTOR");

//		names.sort(new StringComparatorDesc());
		System.out.println("DESC : "+names);

		names.sort(new StringComparatorAsc());
		System.out.println("ASC : "+names);
		
		
		System.out.println("SORTING BY LENGTH USING COMPARTOR");

		names.sort(new StringComparatorLenDesc());
		System.out.println("DESC : "+names);

		names.sort(new StringComparatorLenAsc());
		System.out.println("ASC : "+names);
	}
}


class NumberComparatorDesc implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
}
// 3 5 = 2
// 5 3 = -2
// here swap happen only when compare method return positive value,

class NumberComparatorAsc implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1-o2;
	}
}
// 3 5 = -2
// 5 3 = 2



class StringComparatorAsc implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
}

class StringComparatorDesc implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}


class StringComparatorLenAsc implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
}

class StringComparatorLenDesc implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o2.length() - o1.length();
	}
}

