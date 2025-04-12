package practicejavaprogramtwo;

public class LeftRotateByThreeString {
	
	public static void main(String[] args) {
		String str="arun";
		
		char[] arr=str.toCharArray();
		
		for(int j=0;j<3;j++) {
		char first=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1]=first;
		}
		StringBuffer sb=new StringBuffer();
		
		for(char c:arr) {
			sb.append(c);
		}
		
		System.out.println(sb.toString());
		
		
		
	}

}
