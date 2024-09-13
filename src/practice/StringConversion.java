package practice;

public class StringConversion {
	public static void main(String[] args) {
		
		//String to Integer
		String str="9";
		String str1="abc";
		//System.out.println(Integer.parseInt(str1));
		System.out.println(str+1);
		int converted=Integer.parseInt(str);
		System.out.println(converted+1);
		
		int newConvert=Integer.valueOf(str);
		System.out.println(newConvert+1);
		
		System.out.println("==================================================================");
		//Integer to String
		
		int a=12322;
		
		String str3=Integer.toString(a);
		System.out.println(str3.length());
		System.out.println(str3.charAt(0));
		
	}

}
