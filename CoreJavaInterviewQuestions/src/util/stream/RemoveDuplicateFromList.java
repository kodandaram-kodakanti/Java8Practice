package util.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Bangalore");
		cityList.add("Bangalore");
		cityList.add("Hyderabad");
		cityList.add("Hyderabad");
		cityList.add("Delhi");
		cityList.add("Kolkatha");
		cityList.add("Kolkatha");
		cityList.add("Chennai");
		cityList.add("Chennai");

		System.out.println("Size of List: " + cityList.size());
		
		/**Java8**/
		List<String> distinctList = cityList.stream().distinct().collect(Collectors.toList());
		System.out.println("Size of distinct List(Java8): " + distinctList.size());
		
		/**Java7**/
		List<String> list = new ArrayList<String>();
		for (String city: cityList) {
			if(!list.contains(city)) {
				list.add(city);
			}
		}
		System.out.println("Size of distinct List(Java7): " + list.size());
	}

}