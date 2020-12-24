package io.corejava.exceptionHandling;

/* In this program we are checking the Student age
 * if the student age<12 and weight <40 then our program 
 * should return that the student is not eligible for registration.
 */

public class ThrowExample {

	static void checkEligibilty(int studAge, int stusWeight) {
		if (studAge < 12 && stusWeight < 40) {
			throw new ArithmeticException("Student is not eligible for registration!!");
		} else {
			System.out.println("Student Entry is Valid!!");
		}
	}

	public static void main(String args[]) {
		System.out.println("Welcome to the Registration process!!");
		checkEligibilty(10, 39);
		System.out.println("Have a nice day..");
	}

}
