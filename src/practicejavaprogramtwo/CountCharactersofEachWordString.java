package practicejavaprogramtwo;

public class CountCharactersofEachWordString {

	public static void main(String[] args) {
		String str="Govinda Jay Jay Gopal Krishna";
		
	
		
		verifyLenghOfWords(str);
		//usingSplit(str);

	}

	private static void verifyLenghOfWords(String str) {
		char [] letters=str.toCharArray();
		
		for(int i=0;i<letters.length;i++) {
			String st="";
			while(i<letters.length && letters[i]!=' ') {
				
				st=st+letters[i];
				i++;
			}
			System.out.println(st+":"+st.length());
		}
		
		
	}
	
	public static void usingSplit(String str) {
		String [] word=str.split(" ");
		
		for(String single:word) {
			System.out.println(single +":"+single.length());
		}
		
	}

}
