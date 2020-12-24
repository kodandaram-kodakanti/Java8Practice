package io.corejava;

public class SampleAbstractClass {

	public static void main(String[] args) {
		new TestAbstract1().sayHello();// From concrete class
		new TestAbstract1().display(); // From abstract class
		TestAbstract t1 = new TestAbstract1();
		t1.sayHello();// From concrete class
		
		t1.hi(); //abstract method from PArent class!!
	}

}

abstract class TestAbstract {

	public abstract void hi();

	public void sayHello() {
		System.out.println("Hello!");
	}

	public void display() {
		System.out.println("Display!!");
	}
}

class TestAbstract1 extends TestAbstract {

	@Override
	public void sayHello() {
		System.out.println("Hello! Hi!!");
	}

	@Override
	public void hi() {
		System.out.println("Hi!!");
	}
}
