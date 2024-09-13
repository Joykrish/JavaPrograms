package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class employee{
	int empId;
	String empName;
	int salary;
	
	public employee(int empId,String empName,int salary){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		
	}
}
public class FilterMapCombined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List <employee> emplist=new ArrayList<employee>();
//		emplist.add(new employee(12,"Govinda",1000));
//		emplist.add(new employee(11,"MadhuSudan",2000));
//		emplist.add(new employee(12,"Ram",3000));
		
		List<employee> emplist=Arrays.asList(new employee(12,"Govinda",1000),new employee(11,"MadhuSudan",1600),new employee(12,"Ram",3000),
				new employee(12,"Giridhar",4000));
		
		List<Integer> salList=emplist.stream().filter(e->e.salary>1500)
		.map(e->e.salary)
		.collect(Collectors.toList());
		
		System.out.println(salList);
		

	}

}
