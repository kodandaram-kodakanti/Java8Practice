package stream_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SumOfIntegersGreaterThanTen {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(23, 25, 5, 40, 14, 33, 9);

		System.out.println(sumIntegerJava7(list));

		System.out.println(sumIntegerJava8(list));

	}

	private static int sumIntegerJava8(List<Integer> list) {

		return list.stream().filter(item -> (item > 10)).mapToInt(item -> item).sum();
	}

	private static int sumIntegerJava7(List<Integer> list) {
		// In Java 7:
		Iterator<Integer> iter = list.iterator();
		int sum = 0;
		while (iter.hasNext()) {
			int num = iter.next();
			if (num > 10) {
				sum += num;
			}

		}
		return sum;
	}

}
