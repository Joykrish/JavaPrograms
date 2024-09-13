package variableScopeNew;

public class VarScope {

	private int privateVariable = 10;
	int defaultVariable = 15;
	public int publicVariable = 20;
	protected int protectedVariable = 25;

	public void verifyScope() {
System.out.println("Public");
	}

	void verifyScopeOne() {
		System.out.println("Default");

	}

	protected void verifyScopeTwo() {
		System.out.println("Protected");
	}

	public static void main(String[] args) {

		VarScope scope = new VarScope();
		System.out.println(scope.privateVariable);
		System.out.println(scope.defaultVariable);
		System.out.println(scope.publicVariable);
		System.out.println(scope.protectedVariable);

	}

}
