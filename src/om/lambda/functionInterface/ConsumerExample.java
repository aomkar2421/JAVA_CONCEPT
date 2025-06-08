package om.lambda.functionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		
		Consumer<Integer> printA = x -> System.out.println(x);
		printA.accept(10);
		
		Consumer<Integer> printB = x -> System.out.println(x);
		printB.accept(20);
		
		Consumer<Integer> andThen = printA.andThen(printB);
		andThen.accept(99);
		
		Consumer<List<Integer>> printList = x-> {
			for (Integer a : x) {
				System.out.print(a+" ");
			}
		};
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		printList.accept(list);
	}
}