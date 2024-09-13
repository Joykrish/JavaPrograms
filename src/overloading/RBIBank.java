package overloading;

public class RBIBank  {
	
	public int houseInterest() {
		return 8;
	}

	public int carInterest() {
		return 11;
	}
	
	public RBIBank getObject() {
		RBIBank hs = new RBIBank();
		return hs;
		
	}
}
