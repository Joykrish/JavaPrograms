package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethodsThree {
	public static void main(String[] args) {
		List<String> numbersTest = Arrays.asList("A", "B", "C",   "1", "2", "3");
		
		//BinaryOperator<String>
		Optional<String> reduced=numbersTest.stream().reduce((value, combinedValue) -> {
			return  combinedValue+value ;
			});
		System.out.println(reduced.get());
	}

}
