package io.corejava;

class Vehicle {
	{
		System.out.println("Vehicle: instance block!!");
	}
	static {
		System.out.println("Vehicle: static block!!");
	}
}

class Car extends Vehicle {
	static {
		System.out.println("Car: static block!!");
	}
	{
		System.out.println("Car: Instance Block!!");
	}
}

public class StaticInitializerAndInstanceInitializerBlock extends Car {
	
	StaticInitializerAndInstanceInitializerBlock(){
		System.out.println("Default constructor!!");
	}

	public static void main(String[] args) {
		System.out.println("main() method: Wheel Class!!");
		new StaticInitializerAndInstanceInitializerBlock();
		System.out.println("End!!!");
	}

	static {
		System.out.println("Wheel: static block!");
	}
	
	{
		System.out.println("Wheel: Instance block!");
	}
}