package javaExersize;

public class CountStringOccurance {
	
	public static void main(String[] args) {
	int count=countOccurance("aaadddbbfgesyt",'b');
	System.out.println(count);
		
		
	}
	
	public static int countOccurance(String word,char ch) {
		int t=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==ch) {
				t++;
			}
		}
		return t;
	}

}
