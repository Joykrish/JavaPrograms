package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapDemoTwo {
	public static void main(String[] args) {
		List<String> namesGod=Arrays.asList("Radha","Madhav","ShriGaurange","Madhusudan","Madhav","Giridhar");
		List<Integer> len=new ArrayList<Integer>();
		//before java 8 or without stream
		
		for(String str:namesGod) {
			System.out.println(str.length());
			len.add(str.length());
			
		}
		System.out.println(len);
		System.out.println("-------------------------------------------");
		//using Map or after java 8
		
		namesGod.stream().map(le->le.length()).forEach(le->System.out.println(le));
		namesGod.stream().map(le->le.length()).forEach(System.out::println);
		
		len=namesGod.stream().map(god->god.length()).collect(Collectors.toList());
		System.out.println(len);
		
		Set<Integer> unique=namesGod.stream().map(god->god.length()).collect(Collectors.toSet());
		System.out.println(unique);
	}

}
