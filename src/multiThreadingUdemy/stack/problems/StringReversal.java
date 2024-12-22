package multiThreadingUdemy.stack.problems;

public class StringReversal {
	
	public static String  reverseString(String str) throws Exception {
		
		Linkedstack stack=new Linkedstack();
		
		for(int i=0;i<str.length();i++) {
			stack.push(str.charAt(i));
					
		}
		
		char[] reversed=new char[str.length()];
		
		int i=0;
		
		while(!stack.isEmpty()) {
			reversed[i]=stack.pop();
			i++;
		} 
		return new String(reversed);
	}
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Reverser String is: "+reverseString("Krishna"));
		System.out.println("Reverser String is: "+reverseString("Malayalam"));
		
	}

}
