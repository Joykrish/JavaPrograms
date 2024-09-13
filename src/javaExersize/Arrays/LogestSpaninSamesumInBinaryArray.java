package javaExersize.Arrays;

public class LogestSpaninSamesumInBinaryArray {
	public static void main(String[] args) {
		
		int arr1[] ={0,0,1,1,1,1,1};
		int arr2[]= {1,1,1,1,1,0,1};
		
		System.out.println(longestCommonSum(arr1,arr2));
		
		
	}
	
	public static int longestCommonSum(int[] arr1,int[] arr2) {
		int maxlen=0;
		for(int i=0;i<arr1.length;i++) {
			int sum1=0,sum2=0;
			for(int j=i;j<arr1.length;j++) {
				sum1=sum1+arr1[j];
				sum2=sum2+arr2[j];
				
				if(sum1==sum2) {
					int len=j-i+1;
					if(len>maxlen)
						maxlen=len;
				}
			}
		}
		return maxlen;
	}

}
