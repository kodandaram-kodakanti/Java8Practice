package io.corejava;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * To know whether the collection is structurally modified or not, fail-fast
 * iterators use an internal flag called modCount which is updated each time a
 * collection is modified.Fail-fast iterators checks the modCount flag whenever
 * it gets the next value (i.e. using next() method), and if it finds that the
 * modCount has been modified after this iterator has been created, it throws
 * ConcurrentModificationException.
 */

public class FailFastExample {
	public static void main(String[] args) {
		Map<String, String> cityCode = new HashMap<String, String>();
		cityCode.put("Delhi", "India");
		cityCode.put("Moscow", "Russia");
		cityCode.put("New York", "USA");

		Iterator iterator = cityCode.keySet().iterator();

		while (iterator.hasNext()) {
			try {
				System.out.println(cityCode.get(iterator.next()));
			} catch (ConcurrentModificationException cme) {
				System.out.println(cme);
				System.out.println("New Map: " + cityCode);
				break;
			}

			// adding an element to Map
			// exception will be thrown on next call
			// of next() method.
			cityCode.put("Istanbul", "Turkey");
		}
	}
}