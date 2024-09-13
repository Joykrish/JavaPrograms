package overloading;

public class HDBFBank extends RBIBank {

	public static void main(String[] args) {

		HDBFBank hs = new HDBFBank();
		System.out.println(hs.houseInterest());
		
		System.out.println(hs.testMethod());
		
		

	}

	public int houseInterest() {
		return 9;
	}
	
	public HDBFBank getObject() {
		HDBFBank hs = new HDBFBank();
		return hs;
		
	}
	
	public Integer testMethod() {
		return 10;
		
		
	}
}
  