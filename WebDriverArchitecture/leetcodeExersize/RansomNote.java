package leetcodeExersize;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
public static void main(String []args) {
	System.out.println(canConstruct("yash","jaykishor"));
}

public static boolean canConstruct(String ransomNote,String Magazine) {
	
	Map<Character,Integer> map=new HashMap<>();
	
	for(int i=0;i<Magazine.length();i++) {
		if(map.containsKey(Magazine.charAt(i))) {
			map.put(Magazine.charAt(i), map.get(Magazine.charAt(i))+1);
		}
		else {
			map.put(Magazine.charAt(i), 1);
		}
	}
	
	int count=0;
	
	for(int i=0;i<ransomNote.length();i++) {
		char ch=ransomNote.charAt(i);
		if(map.containsKey(ch)&& map.get(ch)>0) {
			count++;
			map.put(ch, map.get(ch)-1); 
		}
		else {
			break;
		}
	}
	
	if(count==ransomNote.length()) {
		return true;
	}
	return false;
}
}
