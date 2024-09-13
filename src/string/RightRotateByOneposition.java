package string;

import java.util.Arrays;

public class RightRotateByOneposition {
	public static void main(String[] args) {
		String str="HareKrishna";
		char[] st=str.toCharArray();
		
		int size=st.length;
		char last=st[size-1];
		
		for(int i=size-1;i>0;i--) {
			st[i]=st[i-1];
		}
		st[0]=last;
		System.out.println(Arrays.toString(st));
		
		StringBuffer sb=new StringBuffer();
		
		for(char c:st) {
		sb.append(c);
		}
		System.out.println(sb);
	}
	
	
}
