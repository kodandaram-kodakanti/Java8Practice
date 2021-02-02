package util.stream;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * The SimpleDateFormat class mutates its internal state for formatting and
 * parsing dates. That’s why it results in these issues when multiple threads
 * use the same instance of SimpleDateFormat concurrently.
 * 
 * Solution: Create a new instance of SimpleDateFormat for each thread. ( or )
 * Synchronize concurrent access by multiple threads with a synchronized keyword
 * or a lock.
 * 
 ****/

public class DateTimeFormatterThreadSafetyExample {
	private static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

	public static void main(String[] args) {
		
		/*
		 * LinkedList<String> list = new LinkedList<>(); list.add("ABC");
		 * list.add("AABC"); list.add("ABCABC"); System.out.println(list);
		 */
		String dateStr = "2018-06-22T10:00:00";

		ExecutorService executorService = Executors.newFixedThreadPool(10);

		Runnable task = new Runnable() {
			@Override
			public void run() {
				parseDate(dateStr);
			}
		};

		for (int i = 0; i < 100; i++) {
			executorService.submit(task);
		}

		executorService.shutdown();
	}

	private static void parseDate(String dateStr) {
		try {
			LocalDateTime date = LocalDateTime.parse(dateStr, dateFormat);
			System.out.println("Successfully Parsed Date " + date);
		} catch (Exception e) {
			System.err.println("OtherError " + e);
		}
	}
}