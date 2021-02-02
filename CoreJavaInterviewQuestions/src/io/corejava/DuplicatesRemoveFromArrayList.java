package io.corejava;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesRemoveFromArrayList {

	public static void main(String[] args) {

		// creating ArrayList with duplicate elements
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7); // duplicate
		primes.add(7);
		primes.add(11);

		System.out.println("Before removing duplicates: " + primes);

		// Now let's remove duplicate element without affecting order
		// LinkedHashSet will guaranteed the order and since it's set
		// it will not allow us to insert duplicates.
		// repeated elements will automatically filtered.

		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>(primes);
		primes.clear();

		primes.addAll(linkedHashSet);
		System.out.println("After removing duplicates: " + primes);
	}

}