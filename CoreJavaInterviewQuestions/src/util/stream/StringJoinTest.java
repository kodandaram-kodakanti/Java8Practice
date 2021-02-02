package util.stream;

import java.util.Arrays;
import java.util.List;

public class StringJoinTest {

	public static void main(String[] args) {

		/***
		 *
		 * Joining arbitrary number of String
		 * 
		 ***/
		String combined = String.join(" and ", "LinkedIn", "Microsoft");
		System.out.println("string joined by and : " + combined);

		/**
		 * String.join() to join String literals by PIPE character
		 *
		 ***/
		String banks = String.join("|", "Citibank", "Bank of America", "Chase");
		System.out.println("banks: " + banks);

		/**
		 * join all elements of a List by commas
		 * 
		 **/
		List<String> payCompanies = Arrays.asList("Apple pay", "Samsung Pay", "Paypal");
		String wallats = String.join(",", payCompanies);
		System.out.println("electronic wallats : " + wallats);

		/***
		 * String.join() to join elements of an array in Java
		 * 
		 ***/
		String[] typesOfCards = { "Credit card", "Debit card", "Master Card" };
		String cards = String.join(",", typesOfCards);
		System.out.println("cards: " + cards);

		/******/

		/******/
	}

}
