package io.corejava;

/**
 * try-catch block can not be at class level. These are meant for only inside
 * methods..
 */

public class ConstructorInTryCatch {
	// try { // invalid placement
	ConstructorInTryCatch() {
		System.out.println("Inside ConstructorInTryCatch() constroctor!!");
	}
	// }
	// catch(Exception e) {

	// }
	public static void main(String[] args) {
		new ConstructorInTryCatch();
	}
}
