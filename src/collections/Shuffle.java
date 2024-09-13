package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {

	public static void main(String[] args) {
		ArrayList<String> ls=new ArrayList<String>();
		
		ls.add("Radha");
		ls.add("Govinda");
		ls.add("Madhusudan");
		ls.add("Govardhan");
		ls.add("ShamSundar");
		ls.add("ParthSarathi");
		System.out.println("Before shuffle"+ls);
		Collections.shuffle(ls);
		System.out.println("After shuffle"+ls);
	}
}
