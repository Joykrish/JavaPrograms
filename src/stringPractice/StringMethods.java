package stringPractice;

public class StringMethods {
	
	public static void main(String [] args) {
		String s="abcdefghij";
		
		String s1="as df d  ";
		
		System.out.println(s.charAt(0));
		
		System.out.println(s.length()); 
		
		System.out.println(s.substring(2));
		System.out.println(s.substring(0,5));
		System.out.println(s.indexOf('e'));
		System.out.println(s.equals(s1));
		System.out.println(s.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s.startsWith("z"));
		
		StringBuffer sb=new StringBuffer("abcd");
		System.out.println(sb.append("efg"));
		System.out.println(sb.insert(0, 'f'));
		System.out.println(sb.replace(0, 3, "k"));
		System.out.println(sb.delete(0, 3));
		System.out.println(sb.reverse());
	}

}
