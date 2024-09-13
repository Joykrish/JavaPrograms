package overloading;

public class SBIBank extends RBIBank {
	public static void main(String[] args) {
		SBIBank hs = new SBIBank();
		System.out.println(hs.houseInterest());
		
		RBIBank hs1 = new SBIBank();
		System.out.println(hs1.carInterest());

	}
 
	public int houseInterest() {
		return 9;
	}

	//public int carInterest() {  
		//return 14;
	//}
}
