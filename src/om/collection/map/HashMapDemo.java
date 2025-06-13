package om.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(6, "F");
		map.put(7, "G");
		
		System.out.println(map);
		
		for ( Map.Entry<Integer, String> entry : map.entrySet() ) {
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		System.out.println();
		
		for ( Map.Entry<Integer, String> entry : map.entrySet() ) {
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		System.out.println();
		
		for ( Map.Entry<Integer, String> entry : map.entrySet() ) {
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		System.out.println();
		
		for ( Map.Entry<Integer, String> entry : map.entrySet() ) {
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		System.out.println();
		
		for ( Map.Entry<Integer, String> entry : map.entrySet() ) {
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		System.out.println();
		
		for ( Map.Entry<Integer, String> entry : map.entrySet() ) {
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		System.out.println();
		
		
	}
}
