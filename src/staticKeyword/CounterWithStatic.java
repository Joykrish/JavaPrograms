package staticKeyword;

public class CounterWithStatic {
	
	 static int counter;
	 
	 CounterWithStatic(){
		 counter++;
		 System.out.println(counter);
	 }
	 
	 public static void main(String[] args) {
		 CounterWithStatic cs1=new CounterWithStatic();
		 CounterWithStatic cs2=new CounterWithStatic();
		 CounterWithStatic cs3=new CounterWithStatic(); 
	}
	


}
