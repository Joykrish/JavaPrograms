package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application {
	
	public static void main(String[] args) {
		
		HashSet<Employee> hs=new HashSet<Employee>();
		
		hs.add(new Employee("JOy",10000,"Software"));
		hs.add(new Employee("Krish",15000,"Software"));
		hs.add(new Employee("Govinda",12000,"Software"));
		
		
		ArrayList<Employee> arrList=new ArrayList<Employee>(hs);
		Collections.sort(arrList);
		System.out.println(arrList);
		
		
	}

}
