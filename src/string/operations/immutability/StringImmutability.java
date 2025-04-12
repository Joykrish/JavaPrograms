package string.operations.immutability;

public class StringImmutability {

public static void main(String[] args) {
	
	//using string object
	String s1=new String("Hare");
	String s2=new String("Hare");
	
	
	System.out.println(s1==s2);//false
	System.out.println(s1.endsWith(s2));//true
	System.out.println("--------------------------------------------------");
	//sting buffer
	
	StringBuffer sb1=new StringBuffer("Hare");
	StringBuffer sb2=new StringBuffer("Hare");
	System.out.println(sb1==sb2);//false
	System.out.println(sb1.equals(sb2));//false
	System.out.println("------------------Immutability--------------------------------");
	
	//immutability 
	
	String str="Govinda";
	str.concat("gopal");
	
	System.out.println(str);
	
	StringBuffer sbstr=new StringBuffer("Govinda");
	sbstr.append("hare");
	System.out.println(sbstr);
	
	System.out.println("----------------------Using String literals----------------------------------------");
	
	String sr1="Radhe";
	String sr2="Radhe";
	System.out.println(sr1.equals(sr2));
	System.out.println(sr1==sr2);
}
}
