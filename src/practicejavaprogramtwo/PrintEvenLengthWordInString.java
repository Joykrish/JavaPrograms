package practicejavaprogramtwo;

public class PrintEvenLengthWordInString {
	public static void main(String[] args) {
		String mantra="hare Krishna hare Krishna Krishna Krishna hare hare Hare Ram Hare Ram Ram Ram hare hare";
		
		String [] words=mantra.split(" ");
		
		for(int i=0;i<words.length;i++) {
			if(words[i].length()%2==0) {
				System.out.println(words[i]);
			}
		}
	}

}
