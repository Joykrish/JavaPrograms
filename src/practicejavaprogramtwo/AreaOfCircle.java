package practicejavaprogramtwo;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the redius");
		
		 double radius=sc.nextDouble();
		 sc.close();
		 
		 System.out.println("Area of circle is "+Math.PI*(radius*radius));
		
		
		
	}

}
