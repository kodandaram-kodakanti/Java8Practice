package io.hackerEarth.Neustar;

import java.util.ArrayList;
import java.util.List;

class Test1 extends Thread {
	public void run() {
		System.out.println("Run");
	}
}

public class Test extends Test1 {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(2);
		m(l);
		
		Test1 t = new Test1();
		t.run();
		
		String c = "Hello i love india";

		boolean var;
		var = c.startsWith("hello");
		System.out.println(var);

		StringBuilder sb1 = new StringBuilder("123");
		String s1 = "123";
		sb1.append("abc");
		s1 = s1.concat("abc");
		System.out.println(sb1 + "" + s1);

		ArrayList obj = new ArrayList();
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add(1, "D");
		System.out.println(obj);
	}

	private static void m(List<Integer> l) {
		System.out.println(l.get(0));
		//System.out.println(l.get(1));
		
	}

}