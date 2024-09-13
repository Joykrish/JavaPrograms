package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListNewCourse {

	public static void main(String[] args) {
	List<String> Animals = new ArrayList<String>();
		Animals.add("Tiger");
		Animals.add("Dot");
		Animals.add("Cat");
		
//		for(int i=0;i<Animals.size();i++) {
//			System.out.println(Animals.get(i));
//		}
//
		for(String str:Animals) {
			System.out.println(str);
		}
		List<Vehicle> vehicle = new LinkedList<Vehicle>();
		vehicle.add(new Vehicle("Honda","accord",12000,false));
		Vehicle vh=new Vehicle("BMW","E5",20000,false);
		vehicle.add(vh);
		vehicle.add(new Vehicle("Jeep","Wrangler",20000,false));
		
//		for(Vehicle car:vehicle) {
////			System.out.println(car.getMake());
////			System.out.println(car.getModel());
////			System.out.println(car.getPrice());
//			System.out.println(car);
//			
//		}
		printElement(vehicle);
}
	
	public static void printElement(List somelist) {
		for(int i=0;i<somelist.size();i++) {
			System.out.println(somelist.get(i));
		}
	}
}
