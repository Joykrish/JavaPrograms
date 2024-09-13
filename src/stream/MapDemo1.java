package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
	public static void main(String[] args) {
		List<String> lst=Arrays.asList("radhe","Govinda","mukunda","Madhusudan","raman");
		
		List<String> lstUPper=new ArrayList<>();
		//before  streams
		for(String str:lst) {
			lstUPper.add(str.toUpperCase());
		}
		
		System.out.println(lstUPper);
		
		//Using java 8 or streams
		List<String> lstuppserMap=lst.stream().map(st->st.toUpperCase()).collect(Collectors.toList());
		System.out.println(lstuppserMap);
		
	}

}
