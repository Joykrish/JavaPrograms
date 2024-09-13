package string;

public class StringRotation {
	
	public static void  main(String[] args) {
		String str="abcd";
		String rotatedStr="bcda";
		
		System.out.println(isRotation(str,rotatedStr));
	}
	
	public static boolean isRotation(String str,String rotationStr) {
		if(str==null||rotationStr==null) {
			return false;
		}
		else if(str.length()!=rotationStr.length()) {
			return false;
		}
		else  {
			String st=str+str;
			
			return st.contains(rotationStr);
			
		}
	}

}
