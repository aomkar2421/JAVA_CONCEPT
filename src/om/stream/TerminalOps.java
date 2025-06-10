package om.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(13,42,63,74,15,6);
		System.out.println("Original list");
		System.out.println(list);
		System.out.println();


		//collect
		List<Integer> list2 = list.stream().collect(Collectors.toList());
		List<Integer> list3 = list.stream().toList();

		System.out.println(list2);
		System.out.println(list3);


		//for each
		list.stream().forEach(x -> System.out.print(x+" "));
		System.out.println();

		//reduce
		Optional<Integer> reduce = list.stream().reduce((x,y) -> x+y );
		System.out.println(reduce.get());


		//count 
		System.out.println(list.stream().count());


		//match
		System.out.println( list.stream().anyMatch(x -> x==63) );
		System.out.println( list.stream().allMatch(x -> x > 0) );
		System.out.println( list.stream().noneMatch(x -> x==63) );
		
		//findFirst findAny
		System.out.println("\n"+list.stream().findFirst().get());
		System.out.println(list.stream().findAny());

		
		//max min
		System.out.println("\n"+ Stream.of(54,32,65,32,65).max( (a,b) -> b-a ));
		System.out.println(Stream.of(54,32,65,32,65).max((a,b) -> a-b ));
		System.out.println(Stream.of(54,32,65,32,65).min((a,b) -> b-a ));
		System.out.println(Stream.of(54,32,65,32,65).min((a,b) -> a-b ));
		
		
		//
		
		
	}
}
