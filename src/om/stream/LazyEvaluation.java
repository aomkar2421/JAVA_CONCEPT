package om.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluation {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("om", "avi", "abc");
		System.out.println("Original List");
		System.out.println(names+"\n");
		
		Stream<String> filter = names.stream().filter( name ->{
			System.out.println("Filtering : "+name);
			return name.length()>2;
		});
		
		
		System.out.println("Before filtering");
		
		List<String> list = filter.toList();
		System.out.println("\nAfter filtering");
		System.out.println(list);
	}
}
