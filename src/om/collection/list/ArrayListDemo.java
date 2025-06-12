package om.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		//modifiable
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
//		list.add(4,5);//error
		System.out.println(list);
		
		//only set opertaion, error for add
		List<Integer> list2 = Arrays.asList(1,2,3,4);
//		list2.add(7); //error
		System.out.println(list2);
		list2.set(3, 8);
		System.out.println(list2);
		
		
		//not modifiable at all
		List<Integer> list3 = List.of(7,8,9);
		System.out.println(list3);
//		list3.add(3,342);
//		list3.set(0, 555);
		
		
		// to convert into modifiable
		ArrayList<Integer> list4 = new ArrayList<Integer>(list2);
		list4.add(7);
		list4.set(3, 999);
		System.out.println("list4 : "+list4);
		
		
		ArrayList<Integer> list5 = new ArrayList<Integer>(list3);
		System.out.println("list5 : "+list5);
		list5.add(888);
		list5.set(2, 999);
		System.out.println("list5 : "+list5);
		
		
		
	}
}
