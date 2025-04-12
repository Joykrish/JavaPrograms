package practicejavaprogramtwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseCollection {
	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<Integer>();
		
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4); 
		System.out.println("Before reverse"+ls);
		Collections.reverse(ls);
		System.out.println("After  reverse"+ls);
	}

}
