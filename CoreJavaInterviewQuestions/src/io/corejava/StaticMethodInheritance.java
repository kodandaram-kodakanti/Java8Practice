package io.corejava;

/***
 * 
 * 1) The overridden instance method that gets invoked is the one in the
 * subclass. (Sub-Class's overridden method will be invoked). 
 * 2) The hidden static method that gets invoked depends on whether it is invoked from the
 * superclass or the subclass.
 * 
 */

class Animal {

	static {
		System.out.println("static Block : Parent Class");
	}

	public static void testClassMethod() {
		System.out.println("The static method in Parent-Class.");
	}

	public void testInstanceMethod() {
		System.out.println("The instance method in Parent-Class.");
	}
}

public class StaticMethodInheritance extends Animal {

	static {
		System.out.println("static Block : Child Class");
	}

	public static void testClassMethod() {
		System.out.println("The static method in Sub-Class");
	}

	public void testInstanceMethod() {
		System.out.println("The instance method in Sub-Class");
	}

	public static void main(String[] args) {
		StaticMethodInheritance myCat = new StaticMethodInheritance();
		StaticMethodInheritance.testClassMethod();
		Animal myAnimal = myCat;

		Animal.testClassMethod();
		myAnimal.testInstanceMethod();

		Animal myAnimal1 = new StaticMethodInheritance();
		myAnimal1.testInstanceMethod();
		
	}

}
