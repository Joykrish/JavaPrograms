package practicejavaprogramtwo;

public class NoOfOccranceString {
public static void main(String[] args) {
	
	String str="Hare Krishan Rama Govinda";
	
	String arr[]=str.split(" ");
	
	String reverse="";
	for(String s:arr) {
		String reverseword="";
		for(int i=s.length()-1;i>=0;i--) {
			reverseword=reverseword +s.charAt(i);
		}
		reverse=reverse+reverseword+" ";
	}
	
	System.out.println(reverse);
	
}
}