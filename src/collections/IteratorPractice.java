package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
public static void main(String[] args) {
	List<Integer> ls=new ArrayList<Integer>();
	
	for(int i=0;i<10;i++) {
		ls.add(i);
	}
	System.out.println("List before remove"+ls);
	Iterator<Integer> itr=ls.iterator();
	
	while(itr.hasNext()) {
		int i=itr.next();
		
		if(i%2!=0) {
			itr.remove();
		}
		
		
	}
	System.out.println("List after remove"+ls);
	
	
	List<String>ls1=Arrays.asList("String1","String2");
	System.out.println(ls1);

	}



}
