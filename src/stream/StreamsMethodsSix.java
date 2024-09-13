package stream;

import java.util.HashSet;
import java.util.Set;

public class StreamsMethodsSix {
	public static void main(String[] args) {
		Set<String> fruits = new HashSet<String>();
		fruits.add("one apple");
		fruits.add("one mango");
		fruits.add("two apples");
		fruits.add("more grapes");
		fruits.add("two guvas");
		//anyMatch
		boolean result=fruits.stream().anyMatch(value->{return value.startsWith("one");});
		System.out.println(result);
		
		//allmatch
		boolean resultTwo=fruits.stream().allMatch(value->{return value.startsWith("one");});
		System.out.println(resultTwo);
		
		//noneMatch
		boolean resulthree=fruits.stream().noneMatch(value->{return value.startsWith("Tne");});
		System.out.println(resulthree);
	}
}
