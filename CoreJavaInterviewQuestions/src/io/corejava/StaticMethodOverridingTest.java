package io.corejava;

/**
 * 
 * We can declare static methods with same signature in subclass, but it is not
 * considered overriding as there won’t be any run-time polymorphism. Hence the
 * answer is ‘No’.
 * w
 * Overriding is depends on having an instance of a class. A static method is
 * not associated with any instance of a class; so the concept is not
 * applicable.
 * 
 */

class A {
	//public final String A;
	static void display() {
		System.out.println("From Class A!");
	}
}

class B extends A {
	static void display() {
		System.out.println("From Class B!");
	}
}

public class StaticMethodOverridingTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		A a = new B();
		a.display();

		A b = new A();
		b.display();
	}
}
