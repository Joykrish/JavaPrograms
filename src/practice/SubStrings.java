package practice;

public class SubStrings {
	
	public static void main(String[] args) {
		String name="www.harekrishnaGovinda.com";
		
		String firstfour=name.substring(0,4);
		System.out.println(firstfour);
		
		
		String lastFour=name.substring(name.length()-4,name.length());
		System.out.println(lastFour);
		
		String website=name.substring(4,name.length()-4);
		System.out.println(website);
	}

}
