package io.corejava;

public class StringInternMethod {

	/**
	 * A pool of strings, initially empty, is maintained privately by theclass
	 * String.
	 * 
	 * When the intern method is invoked, if the pool already contains astring equal
	 * to this String object as determined bythe equals(Object) method, then the
	 * string from the pool isreturned. Otherwise, this String object is added to
	 * the pool and a reference to this String object is returned.
	 * 
	 * It follows that for any two strings s and t, s.intern() == t.intern() is true
	 * if and only if s.equals(t) is true.
	 * 
	 * All literal strings and string-valued constant expressions are interned.
	 * String literals are defined in section 3.10.5 of the The Java™ Language
	 * Specification.
	 * 
	 * Returns: a string that has the same contents as this string, but is
	 * guaranteed to be from a pool of unique strings.
	 */
	public static void main(String[] args) {

		// str1 & str2 shares same reference from String Constat pool.
		String str1 = "abc";
		String str2 = "abc";

		System.out.println(str1 == str2); // true

		// str3 & str4 will be created in HeapArea with different references.
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3 == str4); // false

		// str5 will be loaded from String Constant Pool and references to str1 & str2
		// values.
		String str5 = new String("abc").intern();
		System.out.println(str1 == str5); // true
		System.out.println(str2 == str5); // true

	}

}
