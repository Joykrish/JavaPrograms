package youtubepractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseCollection {
	
	public static void main(String[] args) {
		List<Character>ls=Arrays.asList('a','c','f','g','c');
		
		System.out.println(ls);
		
		Collections.reverse(ls);
		System.out.println(ls);
	}

}
