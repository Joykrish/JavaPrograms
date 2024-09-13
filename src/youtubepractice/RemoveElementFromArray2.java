package youtubepractice;

import java.util.Arrays;

public class RemoveElementFromArray2 {
	
	public static void main(String[] args) {
		int arr[] = {1,3,5,6,3,8,10,4,14};
		
		int [] arrDelete=new int [arr.length-1];
		
		
		int tobeDeleted=2;
		
		
		for(int i=0,j=0;i<arr.length;i++) {
			
			if(i==tobeDeleted){
				continue;
			}
			arrDelete[j++]=arr[i];
				
			}
		
		System.out.println(Arrays.toString(arrDelete));
		}
	}


  
