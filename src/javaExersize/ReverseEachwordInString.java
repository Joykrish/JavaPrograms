package javaExersize;

public class ReverseEachwordInString {
	
	public static void main(String[] args) {
		String str="Hare Krishna Rama";
		Duplicate(str);
	}

	private static void Duplicate(String str) {
		// TODO Auto-generated method stub
		String[] array=str.split(" ");
		
		
		for(String a:array) {
			StringBuilder revString=new StringBuilder();
			
			StringBuilder reverseword=new StringBuilder(a);
			reverseword.reverse();
			System.out.print(revString.append(reverseword).append(" ")) ;
			
		}
		
	}

}
