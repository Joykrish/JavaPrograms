package internetexplore.driver;

import java.util.Arrays;

public class ArraysMergeSortedArraysTwo {
    
    // Method to merge two sorted arrays
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];
        
        int i = 0, j = 0, k = 0;
        
        // Merge arrays while comparing elements
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of arr1, if any
        while (i < n1) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of arr2, if any
        while (j < n2) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }
        
        return mergedArray;
    }
    
    // Main method to test the mergeSortedArrays method
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        
        int[] mergedArray = mergeSortedArrays(arr1, arr2);
        
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}
