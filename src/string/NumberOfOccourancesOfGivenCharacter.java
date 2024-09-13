package string;

public class NumberOfOccourancesOfGivenCharacter {
	
	public static void main(String[] args) {
	String str="hareKrishanGovinda";
	char c='r';
	
	int TotalLength=str.length();
	
	String afterReplaceString=str.replace("a","");
	int afterReplaceLength=afterReplaceString.length();
	int occurance=TotalLength-afterReplaceLength;
	
	System.out.println("Occourance of char " +c+ " is "+occurance);
			

}
}
