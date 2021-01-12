package util.stream;

import java.io.IOException;
import java.io.PrintWriter;

@FunctionalInterface
interface CustomFuntionalInterface {
	public abstract int addition(int a, int b);

	public default void print(String text) {
		System.out.println(text);
	}

	public static void print(String text, PrintWriter writer) throws IOException {
		writer.write(text);
	}

}

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		CustomFuntionalInterface customFuntionalInterface = (a, b) -> {
			return (a + b);
		};
		
		System.out.println(customFuntionalInterface.addition(5, 10));
	}
}