package practice;

public class RightRotateStringByOne {
	public static void main(String[] args) {
		String str="HareKrishna";
		
		
		char[] arr=str.toCharArray();
		char last=arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		
		 arr[0]=last;
	
	StringBuffer sb=new StringBuffer();
	for(char c:arr) {
		sb.append(c);
	}
	System.out.println(sb);

}
} 
