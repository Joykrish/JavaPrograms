package generics;

import java.util.ArrayList;

public class UseGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClassExample<Integer> obj=new GenericClassExample<Integer>(10);
		obj.show();
		System.out.println(obj.get());
		GenericClassExample<String> obj1=new GenericClassExample<String>("Radhe");
		obj1.show();
		System.out.println(obj1.get());
		
		
		ArrayList<Integer> list1=new ArrayList();
		list1.add(10);
		list1.add(20);
		//list1.add("Raman");
		m1(list1);
		
		ArrayList<String> list2=new ArrayList<String>();
		
		list2.add("Raman");
		m1(list2);
	}
public static void m1(ArrayList<? extends Number> list) {
	System.out.println(list);
}

}
