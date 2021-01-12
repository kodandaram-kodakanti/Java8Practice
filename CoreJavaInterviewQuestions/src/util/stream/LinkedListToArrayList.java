package util.stream;

import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {

	public static void main(String[] args) {

		List<String> cityList = new LinkedList<String>();
		cityList.add("Bangalore");
		cityList.add("Hyderabad");
		cityList.add("Delhi");
		cityList.add("Kolkatha");
		cityList.add("Chennai");
		System.out.println("LinkedList: " + cityList);
		List<String> cityArrayList = new LinkedList<String>(cityList);
		System.out.println("ArrayList: " + cityArrayList);
	}

}
