package practicejavaprogramtwo;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float weight, height, bmi;
		System.out.println("Plese enter your weight:(in kg) ");
		weight = sc.nextFloat();
		System.out.println("Plese enter your height:(in meters): ");
		height = sc.nextFloat();

		bmi = weight / (height * height);

		System.out.println("your bmi is " + bmi);
		
		
		if (bmi<30) {
			System.out.println("underweight: ");
		}
		
		else if(bmi>=30&& bmi<=50) {
			System.out.println("normal");
			
		}
		else if(bmi>=50&& bmi<=80) {
			System.out.println("overweight");
			
		}
		else {
			System.out.println("Obese");
		}

	}
}
