package io.corejava;

public class PrivateAndStaticClassCreation {

	public static void main(String[] args) {
		new SayHello().sayHello();
		PrivateAndStaticClassCreation.SayHi.sayHi();
	}
	
	private static class SayHi{
		public static void sayHi() {
			System.out.println("Hi..");
		}
	}
	
	private static class SayHello{
		void sayHello() {
			System.out.println("Hello");
		}
	}
}


