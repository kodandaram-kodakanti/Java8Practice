package util.stream;

public class CamelCaseSplitTest {
	/**
	 * Split the given string at Camel/Capital Character occurrance and generate a
	 * new String with spaces before each Camel character. Ignore the first
	 * character at 0th index.
	 * 
	 * OR
	 * 
	 * Add spaces before Capital Letters.
	 * 
	 */

	public static void main(String[] args) {

		String str = "HowAreYouOkayAndWhatIsTheSolution";
		char[] charArray = str.toCharArray();

		int previousWordIndex = 0;
		String temp = "";
		for (int i = 0; i < charArray.length; i++) {
			if (i > 0 && Character.isUpperCase(charArray[i])) {
				if (temp == "") {
					temp = str.substring(previousWordIndex, i);
				} else
					temp = temp + " " + str.substring(previousWordIndex, i);

				previousWordIndex = i;
			}
		}
		System.out.println(temp + " " + str.substring(previousWordIndex, str.length()));
	}
}
