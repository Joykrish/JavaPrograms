package leetcodeExersize;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;


public class SumOfUniqueEleArray {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array Size");
		
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		usingMap(arr);
	}
	

		
	public static void usingMap(int [] arr) {
		
		Map<Integer,Integer> map=new HashMap<>();
		
		int sumOfUnique=0;
		
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				sumOfUnique+=entry.getKey();
			}
		}
		
		System.out.println("Sum of unique number is: "+sumOfUnique);
	}
	}
	
	


