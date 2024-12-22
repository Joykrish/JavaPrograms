package leetcodeExersize;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String str = "Hare Krishna Govinda";

	int lengthLastWord=	lengthLastWord(str);
	System.out.println(lengthLastWord);
	
	int lengthLastWordTwo=	lengthLastWordTwo(str);
	System.out.println(lengthLastWordTwo);

		
	}

	public static int lengthLastWord(String str) {
		String[] arr = str.split(" ");

		return arr[arr.length - 1].length();

	}
	
	public static int lengthLastWordTwo(String str) {
		String lastword = "";
		for(int i=0;i<str.length();i++) {
			lastword = "";
			while(i<str.length() && str.charAt(i)!=' ') {
				lastword=lastword+str.charAt(i);
				i++;
				
			}
		}
		return lastword.length();
	}
}
