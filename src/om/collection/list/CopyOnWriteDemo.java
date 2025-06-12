package om.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {
	public static void main(String[] args) {

		List<String> alist = new ArrayList<String>();
		alist.add("A");
		alist.add("B");
		alist.add("C");
		alist.add("D");

		System.out.println("Original Arraylist : "+alist);

		//it gives error as concurrent modification is not allowed
		//		for (String item : alist) {
		//			if (item == "C") {
		//				alist.add("E");
		//				System.out.println("Item is Added");
		//			}
		//		}

		System.out.println("Modified Arraylis : "+alist);



		List<String> list = new CopyOnWriteArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		System.out.println("Original CopyOnWriteArrayList : "+list);

		//it will not give error as concurrent modification is allowed HERE
		for (String item : list) {
			if (item == "C") {
				list.add("E");
				System.out.println("Item is added");
			}
			System.out.println(item);
		}

		System.out.println("\nModified CopyOnWriteArrayList : "+list);

	}
}
