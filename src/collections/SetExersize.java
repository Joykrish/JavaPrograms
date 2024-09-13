package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class SetExersize {
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		//ArrayList<Integer>set=new ArrayList<Integer>();
 		set.add(20);
		set.add(10);
		set.add(12);
		set.add(13);
		set.add(15);
		set.add(10);
		
		for(int i:set) {
			System.out.println(i);
		}
		
		
		HashSet<Animal> animal=new HashSet<Animal>();
		Animal an1=new Animal("Dog",2);
		Animal an2=new Animal("Cat",3);
		Animal an3=new Animal("Donkey",5);
		Animal an4=new Animal("Dog",2);
		Animal an5=new Animal("Human",50);
		animal.add(an1);
		animal.add(an2);
		animal.add(an3);
		animal.add(an4);
		animal.add(an5);
		System.out.println(an1.equals(an4));
		
		System.out.println(an1.hashCode());
		System.out.println(an4.hashCode());
		
		for(Animal an:animal) {
			System.out.println(an);
			
		}

	}

}
