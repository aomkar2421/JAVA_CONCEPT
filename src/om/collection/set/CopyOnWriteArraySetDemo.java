package om.collection.set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
	public static void main(String[] args) {
		
		CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<Integer>();
		ConcurrentSkipListSet<Integer> set2 = new ConcurrentSkipListSet();
		System.out.println("Original CopyOnWriteArraySet : "+set);
		System.out.println("Original ConcurrentSkipListSet : "+set2+"\n");
		
		set.add(67);
		set.add(47);
		set.add(47);
		set.add(33);
		set.add(890);
		set.add(2);
		set.add(566);
		set.add(235);
		
		set2.add(67);
		set2.add(47);
		set2.add(47);
		set2.add(33);
		set2.add(890);
		set2.add(2);
		set2.add(566);
		set2.add(235);
		
		for (Integer integer : set) {
			System.out.println("CopyOnWriteArraySet : "+integer);
			set.add(90); // this will be added but will not distort consistency of current operation, i.e. will not br printed
		}
	
		System.out.println("\n\n");
		for (Integer integer : set2) {
			System.out.println("ConcurrentSkipListSet : "+integer);
			//it is inconsitent it add values but it does not garunty that value which was added will distort current operation or not
			if (integer == 890) {
				set2.add(99999);
			}
			set2.add(90); 
		}
	
		System.out.println("\nCopyOnWriteArraySet : "+set);
		System.out.println("ConcurrentSkipListSet : "+set2);
	}
}
