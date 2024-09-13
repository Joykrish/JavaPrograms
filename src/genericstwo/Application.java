package genericstwo;

import java.util.ArrayList;

public class Application {
	public static void main(String[] args) {
		Object myObject=new Object();
		String var="hello";
		myObject=var;
		System.out.println(myObject);
		
		
		Employee emp=new Employee();
		Accountant acc=new Accountant();
		emp=acc;
		
		ArrayList<Employee> employees=new ArrayList<>();
		ArrayList<Accountant> acccountant=new ArrayList<>();
		employees=acccountant;
		ArrayList<?> employees12=new ArrayList<>();
		ArrayList<Accountant> acccountant2=new ArrayList<>();
		employees12=acccountant2;
		ArrayList<? extends Employee> employee3=new ArrayList<>();
		ArrayList<Accountant> acccountant3=new ArrayList<>();
		employee3=acccountant3;
	}

}
