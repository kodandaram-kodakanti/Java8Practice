package io.corejava.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

class Result {

	/**
	 * 
	 * Print the value of Output1 and Output2 in such a way that, Output1 should
	 * print all the characters present in String1 but not in String2 and Output2
	 * should print all the characters present in String2 but not in String1.
	 * 
	 * Example: If String1: ABC and String: BC then Output1: A and Output2:
	 * 
	 * If String1: BC and String: BANGALORE then Output1: C and Output2: ANGALORE
	 * 
	 */

	/*
	 * Complete the 'processStrings' function below.
	 *
	 * The function is expected to return a STRING_ARRAY. The function accepts
	 * following parameters: 1. STRING str1 2. STRING str2
	 */

	public static List<String> processStrings(String str1, String str2) {

		System.out.println("Hello");

		return null;

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String str1 = "BC";
		String str2 = "BANGALORE";

		String result1 = str1.chars().mapToObj(i -> (char) i).filter(c -> str2.indexOf(c) < 0).map(String::valueOf)
				.collect(Collectors.joining());

		String result2 = str2.chars().mapToObj(i -> (char) i).filter(c -> str1.indexOf(c) < 0).map(String::valueOf)
				.collect(Collectors.joining());

		System.out.println(result1);
		System.out.println(result2);

		String str11 = bufferedReader.readLine();

		String str12 = bufferedReader.readLine();

		List<String> result = Result.processStrings(str1, str2);
		/*
		 * for (int i = 0; i < result.size(); i++) {
		 * bufferedWriter.write(result.get(i));
		 * 
		 * if (i != result.size() - 1) { bufferedWriter.write("\n"); } }
		 * 
		 * bufferedWriter.newLine();
		 */

		bufferedReader.close();
		// bufferedWriter.close();
	}
}
