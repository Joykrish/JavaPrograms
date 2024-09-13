package practice;

public class RightRotateStringByThree {
	
	public static void main(String[] args) {
		String str="HareKrishna";
		char [] arr=str.toCharArray();
		
		for(int j=0;j<3;j++) {
	  char last=arr[arr.length-1];
	  
	  for(int i=arr.length-1;i>0;i--) {
		  arr[i]=arr[i-1];
	  }
	  
	  arr[0]=last;
		}
	  StringBuffer  sb=new StringBuffer();
	  for(char a:arr) {
		  sb.append(a);
	  }
	  System.out.println(sb);
	}

}
