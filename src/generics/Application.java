package generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
	public static void main(String[] args) {
		Container<Integer,String> ct=new Container<>(12,"Test2");
		ct.printItems();
		
//		int ite=ct.getItem1();
//		String ite1=ct.getItem2();
		
		Set<String> mySet1=new HashSet<String>();
		mySet1.add("First");
		mySet1.add("second");
		mySet1.add("whatever");
		
		Set<String> mySet2=new HashSet<String>();
		mySet1.add("First");
		mySet1.add("second");
		mySet1.add("Computer");
		
		Set<String> resultSet=union(mySet1,mySet2);
		
		Iterator<String> itr=resultSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	
	public static <E> Set<E> union(Set <E>set1,Set<E>set2) {
		
		
		Set<E> result=new HashSet<>(set1);
		result.addAll(set2);
		return result;
		
	}
}
