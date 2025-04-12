package practicejavaprogramsone;

import java.util.Scanner;

class CreditCardIssuer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score: ");
		int score=sc.nextInt();
		
		if(score<400 || score>850) {
			System.out.println("Invalid score entered");
		}
		
		else {
			if(score>=400 && score<600) {
				System.out.println("Silver card");
			}
			else if(score>=600 && score <800) {
				System.out.println("Gold Card");
			}
			else {
				System.out.println("Platinum Card");
			}
		}
sc.close();
	}

}
