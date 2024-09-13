package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) throws Exception {
		String str="hareKrishnaeK";
		int count=0;
		
		//extracted(str, count);
		
		usingMap(str);
	}
	
	

	private static void usingMap(String str) throws Exception {
		char st[]=str.toCharArray();
		Map<Character,Integer>mp=new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<st.length;i++) {
			if(!mp.containsKey(st[i])) {
			mp.put(st[i],1);	
			}
			else {
				mp.put(st[i],mp.get(st[i])+1);
			}
		}
		for(Entry<Character,Integer>entry:mp.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("First non repeating element is "+entry.getKey());
				break;
			}
			
				
			}
		
			
		}
		
			
		
	


	private static void extracted(String str, int count) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
				if(count==0) {
					System.out.println(str.charAt(i));
				}
			}
		}
	}

}
