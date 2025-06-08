package om.lambda.functionInterface;

import java.time.Year;
import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String[] args) {
		
		BiConsumer<Integer, String> print = (x,y) -> {
			System.out.println("Integer is : "+x);
			System.out.println("String is : "+y);
		};
		
		print.accept(9, "Omkar");
	}
}
