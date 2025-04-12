package practicejavaprogramtwo;

public class PrintFirstHalfOfString {
public static void main(String[] args) {
	String str="RadhaMadhav";
	System.out.println("The first half of the string is: "+str.substring(0,str.length()/2));
	System.out.println("The last half of the string is: "+str.substring(str.length()/2));
}
}
