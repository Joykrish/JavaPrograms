package leetcodeExersize;


	
	import java.util.Arrays;

	public class PlusOne {
	    public static void main(String[] args) {
	        int[] digits = {9, 9, 9};
	        int[] result = incrementByOne(digits);
	        System.out.println(Arrays.toString(result));
	    } 

	    public static int[] incrementByOne(int[] digits) {
	        for (int i = digits.length - 1; i >= 0; i--) {
	            if (digits[i] < 9) {
	                digits[i]++;
	                return digits;
	            }
	            digits[i] = 0; // If digit is 9, make it 0 and continue to next digit
	        }
	        
	        // If we have a carry from the most significant digit, create a new array
	        int[] newNumber = new int[digits.length + 1];
	        newNumber[0] = 1;
	        return newNumber;
	    }
	}



