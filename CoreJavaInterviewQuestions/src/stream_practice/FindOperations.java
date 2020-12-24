package stream_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindOperations {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", "B","C","D");
		
		Optional<String> str = list.stream().findFirst();
		
		System.out.println(str.get());
		
		
		
		List<String> emptyList = Arrays.asList();
		
		String empStr = emptyList.stream().findFirst().orElse("EMPTY");
		System.out.println(empStr);
		
	}

}
