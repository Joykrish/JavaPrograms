package practicejavaprogramtwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {
		String[] arr= {"hare","Krishna","Radha","Govidna","Madhusudan"};
		
		List<String> ls=Arrays.asList(arr);
		
		System.out.println(ls);
		
		System.out.println("*************************************");
		
		List<String> list=new ArrayList<>();
		
		Collections.addAll(list, arr);
		System.out.println(list);
		
		System.out.println("*************************************");
		
		List<String> l=new ArrayList<>();
		    
		for(int i=0;i<arr.length;i++) {
			l.add(arr[i]);
		}
		
		System.out.println(l);
		System.out.println("*************************************");
		List<String> ll=new ArrayList<>();
		for(String st:arr) {
			ll.add(st);
		}
		System.out.println(ll);
	}

}
