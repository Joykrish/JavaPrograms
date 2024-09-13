package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ConvertArrayListToSetViceVersa {
	
	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();
		
		set.add(10);
		set.add(11);
		set.add(12);
		set.add(15);
		set.add(13);
		set.add(14);
		set.add(15);
		
		ArrayList<Integer> arrList=new ArrayList<Integer>(set);
		Collections.sort(arrList);
		System.out.println(arrList);
	}

}
