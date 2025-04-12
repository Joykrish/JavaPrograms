package practicejavaprogramtwo;
import java.util.Scanner;
public class Armstrong {
	
   
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number");
	        } else {
	            System.out.println(number + " is not an Armstrong number");
	        }
	        scanner.close();
	    }

	    public static boolean isArmstrong(int number) {
	        // Convert the number to a string to get individual digits
	        String numStr = Integer.toString(number);
	        // Get the number of digits
	        int numDigits = numStr.length();
	        int sumOfPowers = 0;
	        // Calculate the sum of each digit raised to the power of numDigits
	        for (int i = 0; i < numDigits; i++) {
	            int digit = Character.getNumericValue(numStr.charAt(i));
	            sumOfPowers += Math.pow(digit, numDigits);
	        }
	        // Check if the sum is equal to the original number
	        return sumOfPowers == number;
	    }
	}


