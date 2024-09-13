package practice;

public class CountCharacterOccouranceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Radhe Radhe Govinda Govinda Radhe";
		String characterTobeCounted="h";
	  int result= str.length()-str.replaceAll(characterTobeCounted,"").length();
	  System.out.println("Occcounrance of character is "+result);

	}

}
