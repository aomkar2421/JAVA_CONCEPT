package om.collection.list;

import java.util.ArrayList;
import java.util.Vector;

//vector is synchronized i.e. thread safe unlike arraylist & linkedlist, hence using in multi threaded environments
public class VectorDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(20000);
		
		Thread t1 = new Thread( () ->{
			for (int i = 0; i < 10000; i++) {
				arrayList.add(i);
			}
		});
		
		Thread t2 = new Thread( () ->{
			for (int i = 0; i < 10000; i++) {
				arrayList.add(i);
			}
		});
		
		t1.start();
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ArrayList size : "+ arrayList.size());
		
		
		
		Vector<Integer> vector = new Vector<Integer>();
		
		Thread t3 = new Thread( () ->{
			for (int i = 0; i < 10000; i++) {
				vector.add(i);
			}
		});
		
		Thread t4 = new Thread( () ->{
			for (int i = 0; i < 10000; i++) {
				vector.add(i);
			}
		});
		
		t3.start();
		t4.start();
		
		
		try {
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Vector size : "+ vector.size());
	
	}
}
