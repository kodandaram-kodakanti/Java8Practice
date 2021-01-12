package util.stream;

import java.util.Arrays;

public class ParallelStream {

	public static void main(String[] args) {

		String a = "adsdrgaaadfgdfa";
		String b = "adsdrgaaadfgdfa";
		

		char tempArray[] = a.toCharArray(); 
		char tempArray1[] = b.toCharArray(); 
        
		System.out.println( new String(tempArray) );
        // sort tempArray 
       Arrays.sort(tempArray); 
       System.out.println(tempArray == tempArray1);
	}

}
