package staticKeyword;

public class StaticMethod {
	
	int rollNumber;
	String Name;
	static String collageName="BhaktiVedant Minor";
	
	static void changeCollage() {
		collageName="Mayapur Institute";
	}
	
	public StaticMethod(int Rn,String N){
		rollNumber=Rn;
		Name=N;
	}
	
	void display() {
		System.out.println(rollNumber + " "+Name+ " "+collageName);
	}
	
	public static void main(String[] args) {
		StaticMethod.changeCollage();
		StaticMethod vs=new StaticMethod(108,"JOy");
		vs.display();
		StaticMethod vs1=new StaticMethod(109,"Krish");
		vs1.display();
		StaticMethod vs2=new StaticMethod(108,"Govinda");
		vs2.display();
		
		
		
		
	}
	
	

}
