package string;

public class CompareTwoStrings {
	
	public static void main(String args[]) {
		
		String str1="RadhiMadhai";
		String str2="RadhiMadhai";
		//boolean result=false;
		
		System.out.println(isCompare(str1,str2));
		
	}
	
	public static boolean  isCompare(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
			
		}
		else {
			for(int i=0;i<str1.length();i++) {
				if(str1.charAt(i)!=str2.charAt(i)) {
				return false;
				}
				
			}
		
		}
				
		return true;		
	}

}
