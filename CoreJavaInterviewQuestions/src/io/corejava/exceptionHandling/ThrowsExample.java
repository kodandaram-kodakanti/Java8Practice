package io.corejava.exceptionHandling;

import java.io.IOException;

public class ThrowsExample {

	private void myMethod(int num) throws IOException, ClassNotFoundException, NumberFormatException {
		if (num == 3) {
			throw new IOException("IOException Occurred!");
		} else
			throw new ClassNotFoundException("ClassNotFoundException!");
	}

	public static void main(String[] args) {

		ThrowsExample t = new ThrowsExample();
		try {
			t.myMethod(3);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
