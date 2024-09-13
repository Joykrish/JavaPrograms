package staticKeyword;

public class StaticVariable {
	String SName;
	int Snumber;
	
	static String collageName="New Collage";
	
	StaticVariable(String SN,int Snum){
		SName=SN;
		Snumber=Snum;
		 
		
	}
	public void display(){
		System.out.println(SName + " "+Snumber+ " "+collageName );
	}
	
	public static void main(String[] args) {
		
		collageName="Sahani  Collage";
		StaticVariable  sv= new StaticVariable("Joy",108);
		sv.display();
		
		StaticVariable  sv1= new StaticVariable("Krish",116);
		sv1.display();
		
	}
	

}
