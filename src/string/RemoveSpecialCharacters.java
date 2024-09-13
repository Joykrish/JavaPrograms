package string;

public class RemoveSpecialCharacters {
	public static void main(String[] args) {
		String str="HareKrishna234*^*&Jay";
		
		String str1=str.replaceAll("[^A-Za-z0-9]","");
		System.out.println(str1);
	}

}
