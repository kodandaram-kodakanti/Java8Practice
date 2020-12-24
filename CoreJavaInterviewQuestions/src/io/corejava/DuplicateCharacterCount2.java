package io.corejava;

public class DuplicateCharacterCount2 {
	public static void main(String[] args) {
		String str = " Hello how are you ";
		System.out.println("The string is " + str);
		System.out.println(" Duplicate character on above string: ");

		char[] charArray = str.toCharArray();

		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (charArray[i] == charArray[j]) {
					System.out.println(charArray[j]);
					if (charArray[j] == 'o' || charArray[j] == 'O') {

						count++;
					}
					break;
				}
			}

		}
		System.out.println("O: " + count);
	}
}