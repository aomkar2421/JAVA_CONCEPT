package om.lambda.functionInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryVinaryOperator {
	public static void main(String[] args) {
		
		// they are same as functiona as they extends function
		//but diff is that if erguments and return type are same then 
		//just need to define just only one time
		
		Function<Integer,Integer> doubleIt = x -> 2*x;
		UnaryOperator<Integer> doubleIt2 = x -> 2*x;
		
		System.out.println(doubleIt.apply(7)+" "+doubleIt2.apply(7));
		
		
		BiFunction<Integer, Integer, Integer> multiply = (x,y) -> x*y;
		BinaryOperator<Integer> multiply2 = (x,y) -> x*y;
		System.out.println(multiply.apply(4, 5)+" "+multiply2.apply(4, 5));
		
	}
}
