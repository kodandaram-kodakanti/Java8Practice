package stream_practice;

import java.util.Arrays;
import java.util.List;

public class MatchOperations {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(10, 15, 8, 5, 23, 9, 30);

		// anyMath: returning boolean value if any number from the stream is greater
		// than 10
		boolean isAnyMatch = intList.stream().anyMatch(num -> num > 10);
		System.out.println(isAnyMatch);

		// noMatch
		boolean isNoMatch = intList.stream().noneMatch(num -> num > 30);
		System.out.println(isNoMatch);

		// allMatch
		boolean isAllMatch = intList.stream().allMatch(num -> num > 4);
		System.out.println(isAllMatch);

	}

}
