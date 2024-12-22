package leetcodeExersize;

public class SquareRootCalculator {

    public static void main(String[] args) {
        int x1 = 4;
        int x2 = 8;
        
        System.out.println("Input: " + x1 + ", Output: " + findSquareRoot(x1)); // Output: 2
        System.out.println("Input: " + x2 + ", Output: " + findSquareRoot(x2)); // Output: 2
    }

    public static int findSquareRoot(int x) {
        if (x == 0 || x == 1) {
            return x; // Square root of 0 is 0, and square root of 1 is 1
        }
        
        int start = 1, end = x, result = 0;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid*mid is equal to x
            if (mid <= x / mid) { 
                result = mid; // Store the result since we want the floor of the square root
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return result;
    }
}
