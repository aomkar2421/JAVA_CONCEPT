package om.collection.map;

import java.util.LinkedHashMap;import java.util.Map;

public final class LinkedHashMapDemo {
	public static void main(String[] args) {
		
//		LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<Integer, String>(4, 0.5f, true);
		// tree arguments are size, growth factor and access order
		//if access order is set to true then Least Recently Used items came at top of Map for easy removal
		
		linkedMap.put(1, "A");
		linkedMap.put(2, "B");
		linkedMap.put(3, "C");
		linkedMap.put(4, "D");
		linkedMap.put(5, "E");
		
		linkedMap.get(3);
		linkedMap.get(5);
		linkedMap.get(2);
		
		for (Map.Entry<Integer, String> entry : linkedMap.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		System.out.println();
	}
}
