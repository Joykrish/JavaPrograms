package variables;

public class VarTest {
	public static void main(String[] args) {
		Calc c1=new Calc();
		c1.result++;
		c1.result++;
		System.out.println(c1.result);
		
		Calc c2=new Calc();
		System.out.println(c2.result);
		
		Calc.result1=30;
		
		System.out.println(Calc.result1);
		
		
		
		
		
	}
	
	

}
