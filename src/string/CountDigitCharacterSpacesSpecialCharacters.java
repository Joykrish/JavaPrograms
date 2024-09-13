package string;

public class CountDigitCharacterSpacesSpecialCharacters {
	
	public static void main(String[] args) {
		String str="Hare Krishan 1!";
		
		char[] arr=str.toCharArray();
		int lettercount=0;
		int spacescount=0;
		int Digitscount=0;
		int specialCharacterCount=0;
		for(Character c:arr) {
			if(Character.isLetter(c)) {
				lettercount++;
			}
			else if(Character.isDigit(c)) {
				Digitscount++;
			}
			else if(Character.isSpaceChar(c)) {
				spacescount++;
			}
			else {
				specialCharacterCount++;
			}
		}
		
		System.out.println("letters "+lettercount);
		System.out.println("Space "+spacescount);
		System.out.println("Digits "+Digitscount);
		System.out.println("SpecialChar "+specialCharacterCount);
	}

}
