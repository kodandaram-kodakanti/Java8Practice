package stream_practice;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStreamDemo {

	public static void main(String[] args) {

		String[] array = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

		System.out.println("Running Sequential..");

		run(Arrays.stream(array).sequential());

		System.out.println();
		System.out.println("Running Parallel..");

		run(Arrays.stream(array).parallel());

	}

	private static void run(Stream<String> stream) {

		stream.forEach(str -> {
			System.out.println(
					"Time: " + LocalTime.now() + " Value: " + str + " ThreadName: " + Thread.currentThread().getName());

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

	}

}
