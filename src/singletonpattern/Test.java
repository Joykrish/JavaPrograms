package singletonpattern;

public class Test {
	
	public static void main(String[] args) {
		 String str="Krishna";
		 String str1="Krishna";
		 
		 System.out.println(str==str1);
		 System.out.println(str.equals(str1));
		 
		 
		 String str2=new String("Krishna");
		 String str3=new String("Krishna");
		 
		 System.out.println(str2==str3);
		 System.out.println(str2.equals(str3));
		 
		 
		 Singleton s1=Singleton.getInstance();	 
		 Singleton s2=Singleton.getInstance();
		 
		 System.out.println(s1==s2);
		 System.out.println(s1.equals(s2));
	}

}
