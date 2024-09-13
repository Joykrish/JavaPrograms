package string;

public class RemoveSpaces {
	public static void main(String[] args) {
		String str="Hare Krishan Jay";
		
		String str1=str.replaceAll("\\s","");
		System.out.println(str1);
	}

}