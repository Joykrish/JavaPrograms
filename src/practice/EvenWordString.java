package practice;

public class EvenWordString {
	public static void main(String[] args) {
		String str="Hare Krishna Rama";
		
		String [] word=str.split(" ");
		for(String s:word) {
			if(s.length()%2==0) {
				System.out.println("Even word is: "+s);
			}
		}
	}

}
