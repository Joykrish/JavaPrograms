package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArraysToList {
	public static void main(String[] args) {
		String[] arr= {"Red","Yellow","Blue","Pink"};
		List<String> ls=Arrays.asList(arr);
		System.out.println(ls);
		
		List<String> l=new ArrayList<>();
		//Collections.addAll(l, arr);
		//System.out.println(l);
		
		for(String str:arr) {
			
			l.add(str);
			
		}
		System.out.println(l);
		
	}

}
