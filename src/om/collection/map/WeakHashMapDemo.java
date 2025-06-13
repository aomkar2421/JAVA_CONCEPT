package om.collection.map;

import java.util.HashMap;
import java.util.Map;

//weakmap.put("Img2", new Image("IMG 1")); it is strong referance
// String key = new String("img1"); this is also strong referance

//here as weakhashmap has weak referance key new String("img1") its value is grabage collected

public class WeakHashMapDemo {
	public static void main(String[] args) {

		Map<String, Image> map = new HashMap<String, Image>();
		map.put(new String("img1"), new Image("IMG 1"));
		map.put("Img2", new Image("IMG 1"));

		Map<String, Image> weakmap = new java.util.WeakHashMap<String, Image>();
		weakmap.put(new String("img1"), new Image("IMG 1"));
		weakmap.put("Img2", new Image("IMG 1"));



		System.out.println("HashMap : "+map);
		System.out.println("WeakHashMap : "+weakmap);

		System.gc();
		processing();

		System.out.println("HashMap : "+map);
		System.out.println("WeakHashMap : "+weakmap);
	}

	private static void processing() {
		try {
			System.out.println("\nProcessing is in progress\n");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Image{

	String name;

	public Image(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Image [name=" + name + "]";
	}

}