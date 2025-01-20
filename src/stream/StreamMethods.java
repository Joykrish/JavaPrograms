package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
	//distict(),count(),limit()
	public static void main(String[] args) {
		List<String> VehicleList=Arrays.asList("Bus","car","bycycle","bus","car","bike");
		List<String> distinctVehicle=VehicleList.stream().distinct().collect(Collectors.toList());
		System.out.println("Using distict value:"+distinctVehicle);
		System.out.println("---------------------------------------");
		
		VehicleList.stream().distinct().forEach(value->System.out.println(value));
		long count =VehicleList.stream().distinct().count();  
		System.out.println("Count is "+count);
		
		List<String> distinctVehiclelimited=VehicleList.stream().distinct().limit(2).collect(Collectors.toList());
		System.out.println(distinctVehiclelimited);
		
		
		VehicleList.stream().limit(3).forEach(value->System.out.println(value));
		
	}

}
