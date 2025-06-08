package om.lambda.functionInterface;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		
		Predicate<Integer> isEven = (x)-> x % 2 == 0;
		System.out.println(isEven.test(4));
		
		Predicate<Integer> isOdd = (x)-> x % 2 != 0;
		System.out.println(isOdd.test(1));
		
		Predicate<String> startsWith = (str)-> str.startsWith("o");
		boolean test1 = startsWith.test("omkar");
		System.out.println(test1);
		
		Predicate<String> EndsWith = (str)-> str.endsWith("z");		
		boolean test2 = EndsWith.test("omkar");
		System.out.println(test2);

		
		Predicate<String> res1 = startsWith.and(EndsWith);
		System.out.println(res1.test("omkar"));
		
		Predicate<String> res2 = startsWith.or(EndsWith);
		System.out.println(res2.test("omkar"));
		
	}
}
