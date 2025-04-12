package practicejavaprogramtwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FindRepeatedDNASequence {
	public static void main(String[] args) {
	String str="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
	System.out.println(findRepeatedDNASequence(str));
	
	
}
	
	public static List<String> findRepeatedDNASequence(String str) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		List<String> list=new ArrayList<>();
		
		for(int i=0;i<str.length()-10;i++) {
			String result=str.substring(i,i+10);
			if(!map.containsKey(result)) {
				
				map.put(result, 1);
			}
			else {
				list.add(result);
			}
		}
		return list;
	}
}