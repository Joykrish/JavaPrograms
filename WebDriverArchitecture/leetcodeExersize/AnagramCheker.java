package leetcodeExersize;

public class AnagramCheker {
	
	public static void main(String []args) {
		boolean b=isAnagram("anagram","nagaram");
		System.out.println(b);
	}
	
	public static boolean isAnagram(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		int []count=new int[26];
		
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			count[ch-'a']++;
		}
		
		for(int i=0;i<s2.length();i++) {
			char ch=s2.charAt(i);
			count[ch-'a']--;  
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]>0) {
				return false;
			}
		}
		
		return true;
	}

}
