package io.corejava.exceptionHandling;

public class CustomException_ThrowFromMethodTest {

	private void weightCheck(final int weight) throws CustomException_ThrowFromMethod {
		if (weight > 60) {
			throw new CustomException_ThrowFromMethod("Invalid weight!!");
		}
	}

	public static void main(String[] args) {

		CustomException_ThrowFromMethodTest obj = new CustomException_ThrowFromMethodTest();
		try {
			obj.weightCheck(100);
		} catch (CustomException_ThrowFromMethod e) {
			System.out.println("catch() block!");
			System.out.println(e);
		}

	}

}
