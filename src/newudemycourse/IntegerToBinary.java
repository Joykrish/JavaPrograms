package newudemycourse;

import java.util.Scanner;

public class IntegerToBinary {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		System.out.println(Integer.toBinaryString(num));
		
		System.out.println("-------------Second way-------------------");
		
		int [] binaryNumber=new int[10];
		int i=0;
		while(num!=0) {
			binaryNumber[i]=num%2;
			num=num/2;
			i++;
		}
		
		for(int j=i-1;j>=0;j--) {
			System.out.print(binaryNumber[j]);
		}
		sc.close();
	}

}
