 package stringPractice;

public class ImmutabilityandMutability {

	public static void main(String[] args) {
		
		//Immutability
		String s=new String("Radhe");
		s.concat("Krishna");
		System.out.println(s);
		
		
		StringBuffer sb=new StringBuffer("Radhe");
		sb.append(" Krishna");
		System.out.println(sb);
		
		//Equals method
		 String s1=new String("Govinda");
		 String s2=new String("Govinda");
		 System.out.println(s1==s2);
		 System.out.println(s1.equals(s2));
		 
		 StringBuffer sb1=new StringBuffer("Madhusudan");
		 StringBuffer sb2=new StringBuffer("Madhusudan");
		 System.out.println(sb1==sb2);
		 System.out.println(sb1.equals(sb2));
		 
		 
	}
	

	
	
}
