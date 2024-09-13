package variableScopeNew;

public class VarscopeOne {
	
	public static void main(String[] args) {
		VarScope vs=new VarScope();
		System.out.println(vs.publicVariable);
		System.out.println(vs.defaultVariable);
		System.out.println(vs.protectedVariable);
		
		vs.verifyScope();
		vs.verifyScopeOne();
		vs.verifyScopeTwo();
	}

}
