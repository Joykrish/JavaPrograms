package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcatenate {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Hari","Mukunda","Madhav","Radha","Madhusudan");
		List<String> dhams=Arrays.asList("Vrindavan","Mayapur","barasana","Padharpur","Jagannath Puri");
	
		Stream <String>streamone=names.stream();
		Stream <String>streamTwo=dhams.stream();
		
		List<String> streamFinal =Stream.concat(streamone, streamTwo).collect(Collectors.toList());
		System.out.println(streamFinal);
		
		for(String items:streamFinal) {
		System.out.println(items);
			
		}
	}

}
