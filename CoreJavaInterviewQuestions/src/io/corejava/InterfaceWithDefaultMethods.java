package io.corejava;

import java.io.IOException;
import java.io.PrintWriter;

interface InterfaceWithDefaultMethods {
	
	public default void print() {
		System.out.println("Default method from Interface!!");
	}
	
	public default void sayHello() {
		System.out.println("Default method from Interface!!");
	}


	public static void print(String text, PrintWriter writer) throws IOException {
		System.out.println(text);
	}
}

class MyClass implements InterfaceWithDefaultMethods {
	@Override
	public void print() {
		System.out.println("Default method from Sub-class!!");
	}
}

