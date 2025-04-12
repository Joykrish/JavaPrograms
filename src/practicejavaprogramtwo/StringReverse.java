package practicejavaprogramtwo;

public class StringReverse {
	
	public static void main(String[] args) {
		String str="Hare";
		
//		StringBuffer st=new StringBuffer(str);
//		String result=st.reverse().toString();
//		System.out.println(result);
		String reverseString="";
		for(int i=str.length()-1;i>=0;i--) {
			reverseString=reverseString+str.charAt(i);
			
		}
		
	System.out.println(reverseString);
	}

}
