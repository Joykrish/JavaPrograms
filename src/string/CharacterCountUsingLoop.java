package string;

public class CharacterCountUsingLoop {
	
	public static void main(String[]args) {
		String str="Hare Krishna";
		char [] arr=str.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			 String s="";
			while(i<arr.length && arr[i]!=' ') {
				s=s+arr[i];
				i++;
				
			}
			System.out.println(s +":"+s.length());
		}
		
	}

}
