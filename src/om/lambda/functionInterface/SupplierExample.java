package om.lambda.functionInterface;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<String> supplier1 = () -> {
			return "Omkar";
		};
		
		Supplier<String> supplier2 = () -> "Omkar";
		
		System.out.println(supplier1.get()+" "+supplier2.get());
	}
}
