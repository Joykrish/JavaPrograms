package practicejavaprogramtwo;

import java.util.Arrays;

public class MultiplyCorrespondingElement {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5,};
		int[] b = { 11, 22, 33, 44, 55 };
		
		int min=Math.min(a.length, b.length);
		
		int [] muiltiply=new int[min];

		
			for (int i = 0; i < a.length; i++) {
				muiltiply[i] = a[i] * b[i];
				
			}
			
			System.out.println(Arrays.toString(muiltiply));
		}
		
	}


