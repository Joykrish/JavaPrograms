package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		
		Set<String> s=new HashSet<String>();
		s.add("item1");
		
		s.add("item1");
		s.add("LastItem");
		s.add("FinalItem");
		s.add("SecondItem");
		System.out.println(s);
		
		
//		for(String ite:s) {
//			System.out.println(ite);
//		}
		
		Iterator<String> it=s.iterator();
		while(it.hasNext()) {
			String var=it.next();
			if (var.equals("FinalItem")) {
				System.out.println(var);
				
			}
			
			
		}
		
		
	}
	
	
	
	

}
