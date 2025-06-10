package om.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		
		//count even numbers
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		long count = Arrays.stream(arr).filter(x -> x%2 == 0).count();
		System.out.println(count);
		
		
		//creating streams
		
		// from collection
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> stream1 = list.stream();
		
		
		//from array
		int [] arr2 = {1,2,3,4,5};
		IntStream stream2 = Arrays.stream(arr2);
		
		
		//using stream of
		Stream<String> stream = Stream.of("A", "B", "C");


		//infinite strem (generate & iterate)
		Stream<Integer> limit = Stream.generate( () -> 1).limit(20);
		limit.forEach(x -> System.out.print(x+" "));
		System.out.println();
		
		Stream<Integer> limit2 = Stream.iterate(1, x -> x+1).limit(50);
//		limit2.forEach(x -> System.out.print(x+" "));
		limit2.forEach(System.out::println);
	}
}
