package practicejavaprogramtwo;

import java.util.Arrays;

public class SortedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="radhaahav";
		
		char[] letter=str.toCharArray();
		
		Arrays.sort(letter);
		
		String sortedString=new String(letter);
		System.out.println(sortedString);
		

	}

}
