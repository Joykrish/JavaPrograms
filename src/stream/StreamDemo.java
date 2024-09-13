package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String[] args) {
		List<String> Names=Arrays.asList("Krishna","Govinda","RadhaRaman","RadhaMohan","Rama","Govardhan");
		
		List<String> newNames=new ArrayList<String>();
		
		
		//newNames=Names.stream().filter(str->str.length()>4&&str.length()<8).collect(Collectors.toList());
		//System.out.println(newNames);
		
		Names.stream().filter(str->str.length()>4&&str.length()<8).forEach(str->System.out.println(str));
		Names.stream().filter(str->str.length()>4&&str.length()<8).forEach(System.out::println);
		
		
	}

}
