package io.corejava;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIteration {
	public static void main(String args[]) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Integer no = (Integer) itr.next();
			System.out.println(no);
			if (no == 8) {
				System.out.println("ArrayList Before Modification: " + list);
				// This will not print,
				// hence it has created separate copy
				list.add(14);
				System.out.println("ArrayList After Modification: " + list);
			}
		}

		/**
		 * fail-fast concept may not necessarily create clone/snapshot of it in memory
		 * to avoid ConcurrentModificationException. For example, in case of
		 * ConcurrentHashMap, it does not operate on a separate copy although it is not
		 * fail-fast.
		 */
		// Creating a ConcurrentHashMap
		ConcurrentHashMap<Object, Integer> map = new ConcurrentHashMap<Object, Integer>();

		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("null", 11);
		map.put("FOUR", 4);
		

		// Getting an Iterator from map
		Iterator it = map.keySet().iterator();

		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " : " + map.get(key));

			// This will reflect in iterator.
			// Hence, it has not created separate copy
			System.out.println("Map Before Modification: " + map);
			map.put("SEVEN", 7);
			System.out.println("Map After Modification: " + map);
		}

	}
}
