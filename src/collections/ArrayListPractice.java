package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Jay");
		al.add(2);
		al.add('c');
		  al.add(true);
		al.add(null);
		
		System.out.println(al.size());
		System.out.println(al);
		
		System.out.println(al.get(0));
		System.out.println(al.remove(1));
		System.out.println(al);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		for (Object object : al) {
			System.out.println(object);
			
		}
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		String str=(String) al.get(0);
		int num= (Integer) al.get(2);
		
		ArrayList<String> aone=new ArrayList<String>();
		aone.add("one");
		aone.add("two");
		String a=aone.get(0);
		
	} 
	
	
	

}
