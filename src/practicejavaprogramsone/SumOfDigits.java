package practicejavaprogramsone;

import java.util.Scanner;

public class SumOfDigits {
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int evensum=0;
	int oddsum=0;
	while(num>0) {
		 int reminder=num%10;
		 if(reminder%2==0) {
			 evensum=evensum+reminder; 
		 }else {
			 oddsum=oddsum+reminder;}
		 
		 num=num/10;
	}
	System.out.println("Even Sum is: "+evensum);
	System.out.println("Odd Sum is: "+oddsum);
	sc.nextInt();
	
}
	

	
	

}
