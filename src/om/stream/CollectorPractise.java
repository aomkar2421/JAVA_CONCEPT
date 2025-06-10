package om.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorPractise {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("ALICE", "BOB", "BJOBFOE", "KJBB", "KLJBLK", "NJKLK");
		System.out.println("Original String List : "+names);
		List<Integer> nums = Arrays.asList(1,2,3,4,4,5,6,7,7);
		System.out.println("Original Numbers List : "+nums+"\n");


		//collecting to list
		System.out.println(names.stream().collect(Collectors.toList()));
		System.out.println(names.stream().toList());


		//to set
		System.out.println( nums.stream().collect(Collectors.toSet()) );


		//to specific collection
		//list1 & list2 - throw a ClassCastException at runtime because toList() does not guarantee a specific list implementation.

		//ArrayList<Integer> list1 = (ArrayList<Integer>) nums.stream().toList();
		//LinkedList<Integer> list2 = (LinkedList<Integer>) nums.stream().toList();
		LinkedList<Integer> list3 = nums.stream().collect(Collectors.toCollection( () -> new LinkedList<>()));
		LinkedList<Integer> list4 = nums.stream().collect(Collectors.toCollection( LinkedList::new ));

		//System.out.println("list1 : "+list1);
		//System.out.println("list2 : "+list2);
		System.out.println("list3 : "+list3);
		System.out.println("list4 : "+list4);

		
		
		//joinning string list
		String collect = names.stream().collect(Collectors.joining());
		String collect1 = names.stream().collect(Collectors.joining(", "));
		System.out.println(collect);
		System.out.println(collect1);
		
		
		//summarizing data
		IntSummaryStatistics statistics = nums.stream().collect(Collectors.summarizingInt(x->x));
		System.out.println(statistics.getAverage());
		System.out.println(statistics.getCount());
		System.out.println(statistics.getMax());
		System.out.println(statistics.getMin());
		System.out.println(statistics.getSum());


		//grouping
		Map<Integer,List<String>> map = names.stream().collect(Collectors.groupingBy(x -> x.length()));
		System.out.println(map);
		
		Map<Integer,List<String>> map2 = names.stream().collect(Collectors.groupingBy(String::length ));
		System.out.println(map2);
		
		//partitioning
		Map<Boolean,List<String>> map5 = names.stream().collect(Collectors.partitioningBy(x -> x.length() > 4));
		System.out.println(map5);
	}
}
