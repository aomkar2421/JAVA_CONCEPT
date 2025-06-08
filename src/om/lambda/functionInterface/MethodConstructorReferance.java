package om.lambda.functionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodConstructorReferance {
	public static void main(String[] args) {
		
		List<String> stds = Arrays.asList("A", "B", "C");
		
		stds.forEach(x -> System.out.println(x));
		System.out.println("\nIn functinal refernace we dont need to invoke method");
		stds.forEach(System.out::println);
		
		System.out.println();
		List<String> phones = Arrays.asList("X", "Y", "Z");
		List<Mobile> mobileList1 = phones.stream().map(x -> new Mobile(x)).collect(Collectors.toList());
		mobileList1.forEach(x -> System.out.println(x.getName()));
		
		System.out.println("\nIn constructor refernace we dont need to invoke constructor");
		List<Mobile> mobileList2 = phones.stream().map(Mobile::new).collect(Collectors.toList());
		mobileList2.stream().map(Mobile::getName).forEach(System.out::println);
	}
}

class Mobile{
	String name;
	public Mobile(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
}