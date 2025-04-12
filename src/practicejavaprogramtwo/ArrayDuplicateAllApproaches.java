package practicejavaprogramtwo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ArrayDuplicateAllApproaches{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size  of the array");
		int size = sc.nextInt();

		Integer[] arr = new Integer[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the array element");
			arr[i] = sc.nextInt();
		}

		System.out.println("Array inserted is: " + Arrays.toString(arr));

		duplicteElment(arr);
		duplicateElementSet(arr);
		duplicateBruiteForceAppoach(arr);
		bySorting(arr);
		sc.close();

	}

	public static void duplicteElment(Integer[] arr) {
		int count = 1;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer ele : arr) {

			if (!map.containsKey(ele)) {
				map.put(ele, count);
			} else {
				map.put(ele, map.get(ele) + 1);
			}

		}

		for (int val : map.keySet()) {
			if (map.get(val) > 1) {
				System.out.println("Duplicate element using Map is: " + val);
			}
		}

	}

	public static void duplicateElementSet(Integer [] arr) {

		Set<Integer> set=new HashSet<Integer>();
		
		for(int x:arr) {
			if(!set.add(x)) {
				System.out.println(" Duplicate element using set is: "+x);
			}
		}
	}
	
	public static void duplicateBruiteForceAppoach(Integer [] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Element is:  "+arr[i]);
				}
			}
		}
	}
	
	public static void bySorting(Integer[] arr) {
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println("Duplicate element is: "+arr[i]);
			}
		}
	}

}
