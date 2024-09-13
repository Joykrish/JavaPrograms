package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemoTwo {
	
	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("Radhe",null,"Govinda","Madhusudan",null,"Govardhan");
		
		List<String> result=new ArrayList<String>();
		
		result=words.stream().filter(w->w!=null).collect(Collectors.toList());
		System.out.println(result);
	}

}
