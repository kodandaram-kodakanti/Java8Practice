package util.stream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

public class SimpleDateFormatThreadUnsafetyExample {
	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

	public static void main(String[] args) {
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
			Date date = simpleDateFormat.parse(dateStr);
			System.out.println("Successfully Parsed Date " + date);
		} catch (ParseException e) {
			System.err.println("ParseError " + e.getMessage());
		} catch (Exception e) {
			System.err.println("OtherError " + e);
		}
	}
}