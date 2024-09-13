package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeatableCharInString {

	public static void main(String[] args) {

		String str1 = "HareKrishna";
		String str = str1.toLowerCase();

		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int count = 1;
		for (int i = 0; i < str.length(); i++)

		{

			if (!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), count);

			} else {
				map.put(str.charAt(i), map.get(str.charAt(i))+ 1);
			}

		}
		
		for(char c:map.keySet()) {
			if (map.get(c)==1) {
				System.out.println("First non repeated character is:"+c);
				break;
			}
			else  {
				System.out.println("There is no unique character present in the string");
			}
		}
		
		

	}

}
