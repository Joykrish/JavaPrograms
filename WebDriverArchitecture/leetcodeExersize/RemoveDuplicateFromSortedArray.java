package leetcodeExersize;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size =sc.nextInt();
		int [] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			  
			arr[i]=sc.nextInt();
			
		}
		Arrays.sort(arr);
		removeDuplicates(arr);
		System.out.println("Array after removal of duplicates: "+Arrays.toString(arr));
	}
	
	
	    public static int removeDuplicates(int[] arr) {
	        int n = arr.length;
	        // index to keep the track of distinct variables and it starts from 1
	        int count = 1;

	        for (int i = 0; i + 1 < n; i++) {
	            // to Check if next element is greater or not
	            if (arr[i] < arr[i + 1])  {
	                // if it is greater, means next element is distinct,
	                // so add it to count index and increment count by 1
	                arr[count] = arr[i + 1];
	                count++;
	            }
	        }
	        // returns the total number of distinct elements
	        return count;
	    }
	}

