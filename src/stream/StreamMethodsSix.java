package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethodsSix {
	public static void main(String[] args) {
		List<String> stringList=Arrays.asList("oneT","two","three","one","four");
		//List<String> stringList=Arrays.asList();
		Optional<String> ele=stringList.stream().findAny();
		
		System.out.println(ele.get());
		
		Optional<String> ele1=stringList.stream().findFirst();
		System.out.println(ele1.get());
		
	}

}
