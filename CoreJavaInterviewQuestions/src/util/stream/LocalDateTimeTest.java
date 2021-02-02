package util.stream;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Java Program to parse to LocalDateTime in JDK 8. We'll convert a String
 * "2017-03-08 12:30" into LocalDateTime. We'll also see how to format a
 * LocalDateTime instance to String format.
 *
 */

public class LocalDateTimeTest {

	public static void main(String[] args) {
		// parsing a string date to LocalDateTime
		String date = "2017-03-08 12:30";

		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");// This class is immutable and
																					// thread-safe.
		LocalDateTime localDateTime = LocalDateTime.parse(date, format);// This class is immutable and thread-safe.

		System.out.println("origional date as string: " + date);
		System.out.println("generated LocalDateTime: " + localDateTime);

		// formatting a LocalDateTime to string instance
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime localDateTime1 = LocalDateTime.of(2021, Month.JANUARY, 2, 12, 25);
		String formattedString = localDateTime1.format(formatter);
		System.out.println("origional LocalDatetime object: " + localDateTime1);
		System.out.println("generated string : " + formattedString);

		// be careful, string must contain date and time portion
		// if you are converting to LocalDateTime, or else, your
		// code will break
		LocalDateTime dateWithoutTime = LocalDateTime.parse("2017-08-03", format);

	}

}