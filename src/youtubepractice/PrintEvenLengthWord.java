package youtubepractice;

public class PrintEvenLengthWord {
	
	public static void main(String[] args) {
		String str="Hare Krishna hare Ram Govinda";
		
		for(String st:str.split(" ")) {
			if(st.length()%2==0) {
				System.out.println(st);
			}
		}
	}

}
