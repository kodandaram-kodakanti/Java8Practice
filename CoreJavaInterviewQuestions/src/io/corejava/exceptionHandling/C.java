package io.corejava.exceptionHandling;

public class C {

	static {
		System.out.println("C: static block!!");
	}

	public static void main(String[] args) {
		A a = new A();
		a.sayHello();
		A.sayHi();

		B b = new B();
		b.sayHello();
		B.sayHi();

		A a1 = new B();
		a1.sayHello();
		A.sayHi();

		System.out.println();

		a1 = b;
		a1.sayHello();
		a1.sayHi();
		
		System.out.println();
		
		a1 = a;
		a1.sayHello();
		// B b1 = new A(); // Compilation error

	}

	{
		System.out.println("C: Instance block!!");
	}
}
