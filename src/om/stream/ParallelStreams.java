package om.stream;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		List<Integer> list = Stream.iterate(1, x -> x+1).limit(20000).toList();
		list.stream().map(x -> factorial(x)).toList();

		long endTime = System.currentTimeMillis();
		System.out.println("Time Required : "+ (endTime-startTime));


		//parallel Streams
		startTime = System.currentTimeMillis();

		List<Integer> list2 = Stream.iterate(1, x -> x+1).limit(20000).toList();
		list.parallelStream().map(x -> factorial(x)).toList();

		endTime = System.currentTimeMillis();
		System.out.println("Time Required : "+ (endTime-startTime));

	}

	static int factorial(int num) {
		int sum = 1;
		for (int i = 2; i <= num; i++) {
			sum = sum * i;
		}

		return sum;
	}
}
