package om.lambda.functionInterface;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> areEqual = (x,y) -> x==y;
		System.out.println(areEqual.test(8, 9));
		
	}
}
