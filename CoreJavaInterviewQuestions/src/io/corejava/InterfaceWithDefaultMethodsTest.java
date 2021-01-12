package io.corejava;

import java.io.IOException;

public class InterfaceWithDefaultMethodsTest {

	public static void main(String[] args) throws IOException {

		InterfaceWithDefaultMethods i = new MyClass();
		i.print();
		InterfaceWithDefaultMethods.print("Static Method from Interface!!", null);
		MyClass m = new MyClass();
		m.print();
		m.sayHello();

	}

}