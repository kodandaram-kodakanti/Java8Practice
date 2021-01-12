package io.corejava;

import java.util.Arrays;

public class SortArrayExample {

	public static void main(String[] args) {

		int[] array = { 2, 5, 11, 7, 6, 8, 3, 1, 8, 21, 10, 32 };
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.print("Sorted Array is: ");

		Arrays.stream(array).forEach(element -> System.out.print(" " + element));

	}

}
