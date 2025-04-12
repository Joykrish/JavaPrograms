package practicejavaprogramtwo;

public class PrintFirstLetterString {
	
	public static void main(String[] args) {
		String str="Hare Krishna Hare Krishna";
		String [] array=str.split(" ");
		for(String c:array) {
			System.out.print(c.charAt(0)+" ");
			
		}
	}

}
