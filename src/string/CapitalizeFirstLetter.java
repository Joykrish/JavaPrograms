package string;

public class CapitalizeFirstLetter {
public static void main(String[] args) {
	String str="hare Krishna";
	
	String result=str.substring(0, 1).toUpperCase()+str.substring(1);
	System.out.println(result);
}
}
