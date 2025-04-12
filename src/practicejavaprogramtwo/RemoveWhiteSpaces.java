package practicejavaprogramtwo;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String s="Hare krishna Hare Rama";
		System.out.println("before removing black spaces"+s);
		
		String s1=s.replaceAll("\\s", "");
		System.out.println("after removing black spaces"+s1);
	}

}
