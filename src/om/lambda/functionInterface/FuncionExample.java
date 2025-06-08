package om.lambda.functionInterface;

import java.util.function.Function;

public class FuncionExample {
	public static void main(String[] args) {
		
		Function<Integer , String> IntToString = a-> Integer.toString(a);
		System.out.println(IntToString.apply(7));
		
		
		Function<Integer , Integer> doubleIt = a-> 2*a;
		System.out.println(doubleIt.apply(7));
		
		Function<Integer , Integer> trippleIt = a-> 3*a;
		System.out.println(trippleIt.apply(7));
		
		Function<Integer, Integer> composeTest = doubleIt.compose(trippleIt);
		System.out.println(composeTest.apply(-7));
		
		Function<Integer, Integer> andThenTest = doubleIt.andThen(trippleIt);
		System.out.println(composeTest.apply(-7));
		
		Function<Integer, Integer> identityTest = Function.identity();
		System.out.println(identityTest.apply(10));
	}
}
