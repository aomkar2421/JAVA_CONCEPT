package om.collection.map;

import java.util.Map;
import java.util.EnumMap;

public class EnumMapDemo {
	public static void main(String[] args) {
		Map<Days, String> map = new EnumMap<Days, String>(Days.class);
	}
}


enum Days{
	MONDAY, TUESDAT, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}