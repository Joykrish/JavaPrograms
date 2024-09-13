package stream;

import java.util.Arrays;
import java.util.List;

public class StreamMethodFour {

	public static void main(String[] args) {
		List<String> numbersTest = Arrays.asList("A", "B", "C",   "1", "2", "3");
		
		Object [] arr=numbersTest.stream().toArray();
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		for(Object c:arr) {
			System.out.println(c);
		}
	}

}
