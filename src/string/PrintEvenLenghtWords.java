package string;

public class PrintEvenLenghtWords {
	
	public static void main(String[]args) {
		String str="Radhaa Madhav Kunga Bihari Gopjan Vallabh girvardhari";
		
		String[] st=str.split(" ");
		
		for( String s:st) {
		if(s.length()%2==0) {
			System.out.println(s);
		}
		}
	}

}
