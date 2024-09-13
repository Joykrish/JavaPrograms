package practice;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		//FIRST APPROACH

//		int l = arr[0];
//		int h = arr.length - 1;
//		int key = 41;
//
//		boolean flag = false;
// 
//		while (l <= h) {
//
//			int mid = (l + h) / 2;
//
//			if (arr[mid] == key) {
//				System.out.println("Element found ");
//				flag=true;
//				break;
//
//			}
//			if (arr[mid] < key) {
//
//				l = mid + 1;
//
//			}
//			if (arr[mid] > key) {
//
//				h = mid - 1;
//
//			}
//
//		}
//
//		if (flag == false) {
//			System.out.println(" Element not found");
//		}
//	}
		//SECOND APPROACH
		int indexOfArray=Arrays.binarySearch(arr, 8);
		System.out.println(indexOfArray);
}
}