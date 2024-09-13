package constructor;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		t.p1();
		// this.p1();
		
	
		
		
	}

	public void p1() {
		//Test t = new Test(); not correct approach 
		//t.p2();
		this.p2();
		//this.p3(); not correct approach
		Test.p3();
	}

	public void p2() {

	}

	public static void p3() {

	}
	

}
