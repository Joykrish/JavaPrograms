package leetcodeExersize;

public class MergeStringAlternatively {
	
	public static void main(String [] args) {
		String str1="hare";
		String str2="Krishna";
		
		int length1=str1.length();
		int length2=str2.length();
		
		int min=Math.min(length1, length2);
		String longestString="";
		if(min==length1) {
			longestString=str2;
		}
		if(min==length2) {
			longestString=str1;
		}
		
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<min;i++) {
			sb.append(str1.charAt(i)).append(str2.charAt(i));
			
			
		}
		
		sb.append(longestString.substring(min));
		
		System.out.println(sb.toString());
	}
	

}

