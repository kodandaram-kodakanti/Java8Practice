package io.corejava.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Program {
	public static void main(String[] args) {
		List test = new ArrayList();
	    List<String> list = new ArrayList();
	    list.add("JOE,MARY");
	    list.add("A,B");
	    Set<String> f2 = new HashSet<>();

	    for (String str : list) {
	        String[] users = str.split(",");
	        String i1 = users[0];
	        String i2 = users[1];
	        String key = i1.compareTo(i2) > 0 ? i2 + "," + i1 : i1 + "," + i2;
	        f2.add(key);
	    }
	    Iterator val = f2.iterator();
	    while (val.hasNext()) {
	        test.add(val.next());
	    }
	    Collections.sort(test);
	    System.out.println("test" + test);
	}

}
