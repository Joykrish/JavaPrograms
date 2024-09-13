package lamdaExpressionPractice;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human tom=new Human();
		//tom.walk();
		//walker(tom);
		Robot wale=new Robot();
		//wale.walk();
		//walker(wale);
//		walker(new Walkable() {
//
//			@Override
//			public void walk() {
//				System.out.println("Custom Object method...");
//				
//			}
//			
//		});
//		walker(()->{
//			System.out.println("Custom Object Walking");
//			System.out.println("Custom Object two Walking");
//			
//		});
		
		Walkable aBlockOfCode=()->{
			System.out.println("Custom Object Walking");
			System.out.println("Custom Object two Walking");
			
		};
		
		walker(aBlockOfCode);
		
		AlambdaInterface helloVar=()-> System.out.print("hello there");
		calculate sum=(a,b)-> a+b;
		helloVar.sum();
		System.out.println(sum.compute(5, 6));
		
		calculate nonZeroDivider=(a,b)->{
			if(a==0) {
				return 0; 
			}
			return a/b;
		};
		System.out.println(nonZeroDivider.compute(15, 3));
		MyGenericInterface<String> reversal =(str)->{
			String result="";
			for(int i=str.length()-1;i>=0;i--) {
				result=result+str.charAt(i);
			}
			return result; 
		};
		
		
		
		System.out.println(reversal.work("Vehicle"));
		
		MyGenericInterface<Integer>	computedNumber=(n)->{
			int result=1;
			for(int i=1;i<=n;i++) {
				result=result*i;
			}
			return result;
		};
		System.out.println(computedNumber.work(5));
	}
	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
		
		
	}
	public int sum(int arg1,int arg2) {
		return arg1+arg2;
	}
	
	public void sayHello() {
		System.out.println("Hello there");
	}
	
	
	public int nonZeroDivide(int arg1,int arg2) {
		if(arg1==0) {
			return 0; 
		}
		return arg1/arg2;
	}
public String reverse(String str) {
	String result="";
	for(int i=str.length()-1;i>=0;i--) {
		result=result+str.charAt(i);
	}
	return result;  
}

public int factorial(int num) {
	int result=1;
	for(int i=0;i<=num;i++) {
		result=result*1;
	}
	return result;
}
}

interface calculate{
	public int compute(int a,int b);
	
}

interface MyGenericInterface<T>{
	public T work(T t );
	
}

interface takeNumber{
	public int worktest(int num);
	
}
