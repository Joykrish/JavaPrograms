package practice;

public class ReverseEachWordString {

	public static void main(String[] args) {
		String str = "Hare Krishan Hare Rama";

		String[] arraysword = str.split(" ");
String reverseSentence="";
		for (String word : arraysword) {
			int j = word.length()-1;
			String reverseword = "";

			while (0 <=j) {
				reverseword = reverseword + word.charAt(j);
				j--;

			}
			reverseSentence=reverseSentence+reverseword+ " ";
		}
		
		System.out.println(reverseSentence);

	}

}
