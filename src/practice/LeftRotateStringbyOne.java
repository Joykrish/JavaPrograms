package practice;

public class LeftRotateStringbyOne {
	
	public static void main(String[] args) {
		String str="HareKrishna";
		//String str="arun";
		
		char[] arr=str.toCharArray();
		
		char first=arr[0];
		int size=arr.length;
		
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		
		arr[size-1]=first;
		
		StringBuffer sb=new StringBuffer();
		
		for(char c:arr) {
			sb.append(c);
		}
		
		System.out.println(sb.toString());
		
	}

}
