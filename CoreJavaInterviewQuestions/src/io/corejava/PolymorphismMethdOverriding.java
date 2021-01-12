package io.corejava;

import java.io.IOException;

class Parent {
	/** IOException is added bcoz the child class's overridden method has this */
	public String sayHello() throws IOException {
		return "Hello from Parent";
	}
	
}

class Child extends Parent {

	/**
	 * If Child class's overridden method throws any Unchecked exception then it
	 * must be added in parent class's method's signature
	 **/

	@Override
	public String sayHello() throws IOException {
		return "Hello from Child";
	}

	public String sayHello(String message) {
		return "Message from Child: " + message;
	}

	public void sayHello(int i) {
		System.out.println(i);
	}
}

public class PolymorphismMethdOverriding {

	public static void main(String[] args) throws IOException {
		Parent p = new Parent();
		Parent c = new Child();
		Child child = new Child();
		// Child cp = (Child) new Parent(); // java.lang.ClassCastException
		// c.sayHello("Parent Reference to Child Object!!");
		System.out.println(p.sayHello());
		System.out.println(c.sayHello());
		System.out.println(child.sayHello("Child Reference to Child Object!!"));

	}
}