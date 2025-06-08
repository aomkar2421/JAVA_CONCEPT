package om.lambda.functionInterface;

import java.util.function.BiFunction;

public class BiFunctionExample {
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> sum = (x,y) -> x+y;
		System.out.println(sum.apply(9, 10));
	}
}
