package practicejavaprogramtwo;

import java.util.Scanner;

public class CheckGivenProgramisPowerOf4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int number=sc.nextInt();
		
		sc.close();
		
		boolean power=false;
		
		while(number>0) {
			int reminder=number%4;
			if(reminder!=0) {
				break;
			}
			number=number/4;
			
			if(number==1) {
				System.out.println("Given number is power of 4");
				power=true;
				break;
			}
		}
		if(!power) {
			System.out.println("Not a power of 4");
		}
	}

}
