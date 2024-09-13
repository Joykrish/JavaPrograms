package practice;

import java.util.Scanner;

public class PerimeterOfCircle {
	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the redius");
			
			 double radius=sc.nextDouble();
			 sc.close();
			 
			 System.out.println("perimeter of circle is "+2*Math.PI*radius);
			
	}

}
