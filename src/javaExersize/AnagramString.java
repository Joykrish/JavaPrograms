package javaExersize;

public class AnagramString {
	
	public static void main(String[] args) {
		String str1="Java";
		String str2="avaJ";
		System.out.println(CheckAnagram(str1,str2));
		
	}

	private static boolean CheckAnagram(String str1, String str2) {
		// TODO Auto-generated method stub
		char StrChar1[]=str1.toCharArray();
		StringBuilder sb=new StringBuilder(str2);
		
		for(char c:StrChar1) {
			int index=sb.indexOf(String.valueOf(c));
			if(index!=-1) {
				sb.deleteCharAt(index);
			}
			else {
				return false;
			}
			
		}
		return sb.length()==0;
	}

}
