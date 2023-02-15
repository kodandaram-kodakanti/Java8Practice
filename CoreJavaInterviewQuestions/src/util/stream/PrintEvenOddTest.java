package util.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrintEvenOddTest {

	public static void main(String[] args) {
		Integer[] tihNumbers = { 11, 12, 22, 15, 86, 55, 33, 64 };
		System.out.println("Even Numbers: ");
		Arrays.stream(tihNumbers).filter(element -> element % 2 == 0).forEach(System.out::println);

		System.out.println("Odd Numbers: ");
		Arrays.stream(tihNumbers).filter(element -> element % 2 != 0).forEach(System.out::println);

		System.out.println("Even Number in a range: ");
		IntStream.range(0, 11).filter(i -> i % 2 == 0).forEach(System.out::println);

		System.out.println("Sequence Numbers in a range 1-10: ");
		IntStream.rangeClosed(1, 10).forEach(System.out::println);

	}
}