package youtubepractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintCharacterIndescendingOrderOffreq {

	public static void main(String[] args) {
		System.out.println(isRotated("abcd","bcda"));
	}
	
	public static boolean isRotated(String str,String rotatedString) {
		
		if(str==null &&rotatedString==null ) {
			return false;
		}
		else if(str.length()!=rotatedString.length() ) {
			return false;
		}
		
		else {
			String concatenated=str+str;
			return concatenated.contains(rotatedString);
		}
	}

}
