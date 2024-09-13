package string;

public class PrintFirstHalf {
	public static void main(String[ ]args) {
		String str="Hare Krishna  Hare Rama";
		
		int length=str.length();
		System.out.println(length);
		
		String firstHalf=str.substring(0,length/2);
		System.out.println(firstHalf.length());
		System.out.println(firstHalf);
		
	}

}
