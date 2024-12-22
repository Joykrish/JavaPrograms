package leetcodeExersize;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayTwoSumProblem {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		
		int size=sc.nextInt();
		int [] arr=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		//System.out.println(Arrays.toString(twoSum(arr,20)));
		System.out.println(Arrays.toString(twoSumMap(arr,20)));
		
	}
	
	
	public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
	
	 public static int[] twoSumMap(int[] nums, int target) {
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	            if (map.containsKey(target - nums[i])) {
	                return new int[] { map.get(target - nums[i]), i };
	            }
	            map.put(nums[i], i);
	        }
	        return new int[]{-1, -1};
	    }

}
