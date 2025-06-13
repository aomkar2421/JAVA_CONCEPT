package om.collection.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		
//		SortedMap<String, Integer> treeMap1 = new TreeMap<String, Integer>();
//		SortedMap<Integer, String> treeMap2 = new TreeMap<Integer, String>( (a,b) -> b-a );//desc
		SortedMap<Integer, String> treeMap2 = new TreeMap<Integer, String>();//asc
		
//		treeMap1.put("K", 7);
//		treeMap1.put("N", 12);
//		treeMap1.put("D", 78);
//		treeMap1.put("F", 76);
//		treeMap1.put("A", 87);

		treeMap2.put(87, "H");
		treeMap2.put(67, "S");
		treeMap2.put(43, "G");
		treeMap2.put(98, "Q");
		treeMap2.put(11, "A");
		
//		System.out.println(treeMap1);
		System.out.println(treeMap2);
		
		
		System.out.println(treeMap2.firstKey());
		System.out.println(treeMap2.lastKey());
		System.out.println(treeMap2.headMap(50));
		System.out.println(treeMap2.tailMap(70));
		System.out.println(treeMap2.subMap(11, 87));
		
	}
}
