package io.corejava.exceptionHandling;

public class CustomException1Test {

	public static void main(String[] args) {

		try {
			throw new CustomException1("This is my Error message!!");
		} catch (CustomException1 e) {
			System.out.println("Catch Block");
			System.out.println(e);
		}

	}

}