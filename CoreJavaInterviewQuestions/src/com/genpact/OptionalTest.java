package com.genpact;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		Optional<String> opt = Optional.ofNullable(null);

		System.out.println(opt.isPresent());
		System.out.println(Optional.empty().equals(opt));
	}

}
