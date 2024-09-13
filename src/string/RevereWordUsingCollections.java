package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RevereWordUsingCollections {
	
	public static void main(String[] args) {
		String str="Radhaa Madhav Kunga Bihari Gopjan Vallabh girvardhari";
		String[] st=str.split(" ");
		
		List<String> ar=Arrays.asList(st);
		Collections.reverse(ar);
		for(String a:ar) {
			System.out.print(a+" ");
		}
	}

}
