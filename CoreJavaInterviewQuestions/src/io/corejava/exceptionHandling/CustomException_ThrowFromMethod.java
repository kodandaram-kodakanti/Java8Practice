package io.corejava.exceptionHandling;

public class CustomException_ThrowFromMethod extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 393015065028055114L;

	private String errorMessage;
	CustomException_ThrowFromMethod(String eMessage) {
		// This statement should be first line inside constructor.
		// We don't have to override toString() method if we're using parent constructor
		// super(string).
		// The below constructor call prints the errorMessage with fully qualified
		// class name.
		super(eMessage);
		//errorMessage = eMessage;
	}
	
	/*
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CustomException: " +errorMessage;
	}
	*/
}