package util.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book {
	private String name;
	private int releaseYear;
	private String isbn;

	public Book(String name, int releaseYear, String isbn) {
		super();
		this.name = name;
		this.releaseYear = releaseYear;
		this.isbn = isbn;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the releaseYear
	 */
	public int getReleaseYear() {
		return releaseYear;
	}

	/**
	 * @param releaseYear the releaseYear to set
	 */
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}

public class BeanToMapWithSorting {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
		bookList.add(new Book("The Two Towers", 1954, "0345339711"));
		bookList.add(new Book("The Two Towers_1", 1954, "0345339712"));
		bookList.add(new Book("The Return of the King", 1955, "0618129111"));

		/** ISBN as Key & BookName as Value **/
		Map<String, String> map1 = bookList.stream().collect(Collectors.toMap(Book::getIsbn, Book::getName));
		System.out.println(map1);

		/** ISBN as Key & BookName as Value sort by BookName **/
		/**
		 * The 3rd parameter to toMap() method, we're passing (val1, val2)-> (val1 + "+"
		 * + val2) as a merger function since the year 1954 occurs twice as a key
		 **/
		/**
		 * The mergerFunction is useful to handle the conflicts if 2 or
		 * more values have the same key.
		 */
		/**
		 * Below we've used LinkedHashMap for gauranteeing the insertion order. And we
		 * can use TreeMap for having a natural sorting order
		 **/
		LinkedHashMap<Integer, String> sortedMap1 = bookList.stream().sorted(new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o2.getName().compareTo(o1.getName());
			}
		}).collect(Collectors.toMap(Book::getReleaseYear, Book::getName, (val1, val2) -> (val1 + "+" + val2),
				LinkedHashMap::new));
		System.out.println(sortedMap1);
		
		
		
		/**In Java 7, Year as Key & BookName as Value**/
		
	}

}
