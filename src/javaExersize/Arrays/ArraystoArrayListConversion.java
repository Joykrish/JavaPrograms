package javaExersize.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraystoArrayListConversion {

	public static void main(String[] args) {
		String arr[]= {"Radha","Govinda","Krishna","Mukunda"};
		
		//method1
		//System.out.println(usingAsList(arr));
		
		//System.out.println(CollectionsAddAll(arr));
		System.out.println(usingSimpleFor(arr));
		
	}
	
	public static List<String> usingAsList(String[]arr) {
		
		return Arrays.asList(arr);
		
	}
	
	public static List<String> CollectionsAddAll(String[]arr){
		List<String> l=new ArrayList<String>();
		 Collections.addAll(l, arr);
		 return l;
	}
	
	public static List<String> usingSimpleFor(String[] arr){
		List<String> l=new ArrayList<String>();
		for(String s:arr) {
			l.add(s);
		}
		return l;
		}
	
}

