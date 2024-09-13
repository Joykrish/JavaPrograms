package string;

public class Pangram {
	
	public static void main(String args[]) {
		String str="ABCDefghijklmnopqrstuvxyz1";
		String str1=str.toLowerCase();
		
		System.out.println(isPanagram(str1));
	}
	
	public static boolean  isPanagram(String str1) {
		for(char ch='a';ch<'z';ch++) {
			if(str1.indexOf(ch)<0) {
				return false;
			}
		}
		return true;
	}

}
