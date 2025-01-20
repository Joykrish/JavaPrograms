package leetcodeExersize;

public class BalancedString {
	
	public static void main(String [] args) {
		System.out.println(balancedString("RLRRRLLRLL"));
	}

	
	public static int balancedString(String str) {
		if(str==null &str.length()==0) {
			return 0;
		}
		
		int left=0,right=0,count=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch=='L') {
				left++;
			}
			else {
				right++;
			}
			
			if(left==right) {
				count++;
			}
		}
		return count;
	}
}
