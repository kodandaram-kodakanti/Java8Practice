package io.corejava;

/**
 * The final variable of class must have a value before object is created. So
 * the appropriate place where you can assign value to them is constructor. This
 * is used often for immutable objects.
 * 
 * 
 * 
 * Initializing a final variable : We must initialize a final variable,
 * otherwise compiler will throw compile-time error.A final variable can only be
 * initialized once, either via an initializer or an assignment statement. There
 * are three ways to initialize a final variable :
 * 
 * You can initialize a final variable when it is declared.This approach is the
 * most common. A final variable is called blank final variable,if it is not
 * initialized while declaration. Below are the two ways to initialize a blank
 * final variable. A blank final variable can be initialized inside
 * instance-initializer block or inside constructor. If you have more than one
 * constructor in your class then it must be initialized in all of them,
 * otherwise compile time error will be thrown. A blank final static variable
 * can be initialized inside static block.
 */

class X {

	public final String NAME;
	//public final String NAME1;

	X(String name) {
		NAME = name;
		//NAME1 = name;
	}

	public void display() {
		System.out.println(NAME);
	}

}

public class FinalVariableInitialization {

	public static void main(String[] args) {
		X x = new X("Ram K K");
		x.display();

		X xx = new X("KodandaRam K");
		xx.display();
	}

}
