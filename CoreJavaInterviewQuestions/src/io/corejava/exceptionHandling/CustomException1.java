package io.corejava.exceptionHandling;

public class CustomException1 extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	/*
	 * Constructor of custom exception class here I am copying the message that we
	 * are passing while throwing the exception to a string and then displaying that
	 * string along with the message.
	 */
	public CustomException1(String eMessage) {
		errorMessage = eMessage;
	}

	@Override
	public String toString() {
		return "CustomException: " + errorMessage;
	}

}
