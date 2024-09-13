package practice;

public class StringReverseRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Govinda";
		System.out.println(RecurssiveString(str));

	}
	
	private static String RecurssiveString(String str) {
		if (str==null || str.length()<=1) {
			return str;
		}
	
	return RecurssiveString(str.substring(1))+str.charAt(0);
	}

}
