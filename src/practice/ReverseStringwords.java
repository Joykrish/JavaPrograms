package practice;

import java.util.Arrays;

public class ReverseStringwords {
	
	public static void main(String[] args) {
		String sent="Hare krishna Hare Krishna Krishna Krishna hare hare hare rama hare rama rama rama hare hare";
		
		String [] word=sent.split(" ");
		System.out.println(Arrays.toString(word));
		String reverse=" ";
		for(int i=word.length-1;i>=0;i--) {
			reverse=reverse+ " " +word[i]; 
		}
		
		System.out.println(reverse);
	}

}
