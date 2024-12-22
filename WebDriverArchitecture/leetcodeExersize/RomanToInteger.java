package leetcodeExersize;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String roman=sc.nextLine();
		System.out.println("Integer is"+intTOroman(roman));
	}

	public static int intTOroman(String str) {
		
		Map<Character,Integer> map=new HashMap<>();
		
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		char[] arr=str.toCharArray();
		int result=0;
		int i,j;
		
		for(i=0,j=1;j<arr.length;i++,j++) {
			if(map.get(arr[i])>=map.get(arr[j])) {
				result+=map.get(arr[i]);
			}
			else {
				result-=map.get(arr[i]);
			}
		}
		result=result+map.get(arr[i]);
		return result;
	}
}
