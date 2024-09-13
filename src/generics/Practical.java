package generics;

public class Practical {
	
	public void  add(Object value) {
		
	}
	
	public Object get(int index) {
		return null;
	}
	
	
	public static void main(String[] args) {
		Practical pr=new Practical();
		pr.add("Str");
		pr.add(1);
		System.out.println(pr.get(0));
		
	}
	

}
