package practice;

public class CompareStrings {
	public static void main(String[] args) {
		String s1="Radhaa";
		String s2="Radhaa";
		
		boolean iscompare=true;
		if(s1.length()!=s2.length()) {
			iscompare=false;
		
		}
		
		for(int i=0;i<s1.length();i++) {
			if (s1.charAt(i)!=s2.charAt(i)) {
				iscompare=false;
				
			}
		}
		
		
		System.out.println("Two strings are equal: "+iscompare);
		
	}

}
