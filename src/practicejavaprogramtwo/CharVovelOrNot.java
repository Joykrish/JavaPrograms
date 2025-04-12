package practicejavaprogramtwo;

import java.util.Scanner;

public class CharVovelOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the character");
	
	char c=sc.next().charAt(0);
	sc.close();
	
	boolean isVovel=false;
	
	switch(c) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':isVovel=true;
		
	}
	
	if(isVovel) {
		System.out.println("Character is vovel");
	}
	else {
		System.out.println("Character is not vovel");
	}
	
	
	
	}

}
