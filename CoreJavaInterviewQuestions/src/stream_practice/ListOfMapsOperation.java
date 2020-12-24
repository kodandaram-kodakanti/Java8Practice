package stream_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMapsOperation {

	public static void main(String[] args) {

		// Printing a map value from a list of maps.

		List<Map<String, String>> listOfMaps = new ArrayList<Map<String, String>>();

		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "Ram K K");
		map.put("key3", "value3");
		listOfMaps.add(map);

		map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "KodandaRam K");
		map.put("key3", "value3");
		listOfMaps.add(map);

		map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key3", "value3");
		listOfMaps.add(map);

		listOfMaps.stream().filter(mapp -> mapp.containsKey("key2")).map(mapp -> mapp.get("key2"))
				.forEach(System.out::println);
		;
	}

}
