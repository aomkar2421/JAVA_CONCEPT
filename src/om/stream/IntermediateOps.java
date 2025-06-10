package om.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(13,42,63,74,15,6);
		System.out.println("Original list");
		System.out.println(list);
		System.out.println();

		//collect is terminal operation

		//filter
		Stream<Integer> filter = list.stream().filter(x -> x%2 == 0); //no filtering till this point, filtering only happen after terminal ops.
		List<Integer> filteredList = filter.collect(Collectors.toList());
//		List<Integer> filteredList2 = filter.toList();

		System.out.println(filteredList);
//		System.out.println(filteredList2); // In new java version we can use toList() directly without needing collect().

		//map
		List<Integer> list2 = list.stream().map(x -> x*2).collect(Collectors.toList());
		System.out.println(list2);


		//sorted
		List<Integer> list3 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list3);

		List<Integer> list4 = list.stream().sorted((a,b) -> b-a).collect(Collectors.toList());
		System.out.println(list4);


		//skip
		List<Integer> list5 = list.stream().skip(3).collect(Collectors.toList());
		System.out.println(list5);


		//limit
		List<Integer> list8 = list.stream().limit(2).collect(Collectors.toList());
		System.out.println(list8);


		//distinct
		List<Integer> list6 = Arrays.asList(13,42,13,74,42,6);
		System.out.println("\nOriginal list");
		System.out.println(list6);
		System.out.println();


		List<Integer> list7 = list6.stream().distinct().collect(Collectors.toList());
		System.out.println(list7);


		//flatmap
		List<List<String>> ListOfList = Arrays.asList(
				Arrays.asList("A","B"),
				Arrays.asList("C","D"),
				Arrays.asList("E","F")
				);
		
		System.out.println(ListOfList.get(1).get(1));
		List<String> list9 = ListOfList.stream().flatMap( x -> x.stream() ).toList();
		List<String> list10 = ListOfList.stream().flatMap( x -> x.stream() ).map(x -> x.toLowerCase()).toList();
		List<String> list11 = ListOfList.stream().flatMap( x -> x.stream() ).map(String::toLowerCase).toList();
		System.out.println(list9);
		System.out.println(list10);
		System.out.println(list11);
		
		List<String> list12 = Arrays.asList("JAVA IS POWERFUL LANG", "STREAMS ARE GREATE", "HELLO WORLD");
		List<String> list13 = list12.stream().flatMap( x -> Arrays.stream(x.split(" ") ) ).toList();
		List<String> list14 = list12.stream().flatMap( x -> Arrays.stream(x.split(" ") ) ).map(String::toLowerCase).toList();

		System.out.println(list13);
		System.out.println(list14);
		
	}
}
