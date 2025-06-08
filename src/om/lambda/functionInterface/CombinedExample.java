package om.lambda.functionInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CombinedExample {
	public static void main(String[] args) {
		
		Predicate<Integer> testEven = x -> x % 2 == 0;
		Function<Integer, Integer> square = x -> x*x;
		Consumer<Integer> print = x -> System.out.println("Square is : "+x);
		Consumer<Integer> error = x -> System.out.println("Number is Odd : "+x);
		Supplier<Integer> giveInt = () -> 24;
		
		if (testEven.test(giveInt.get())) {
			int val = square.apply(giveInt.get());
			print.accept(val);
		}else {
			error.accept(giveInt.get());
		}
		
	}
}
