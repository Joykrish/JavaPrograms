package string;

public class ReverseEachWord {
	public static void  main(String[] args) {
		String str="Radha Govinda hare Krishna";
		
		String[] arr=str.split(" ");
		String Worldst="";
		for(int i=arr.length-1;i>=0;i--) {
			int k=arr[i].length()-1;
			String reverseword="";
			while(k>=0) {
				arr[i].charAt(k);
				reverseword=reverseword+arr[i].charAt(k);
				k--;
			}
			Worldst=Worldst+reverseword+" ";
			
		}
		System.out.println(Worldst);
	}

}
