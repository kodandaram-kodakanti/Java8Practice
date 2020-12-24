package io.corejava;

public class TryWithoutCatch {

	public static void main(String[] args) throws Exception {

		try {
			System.out.println("Inside Try!");
			throw new Exception();
		}
		// Finally is must
		finally {
			System.out.println("Inside finally!");
		}

	}

}
