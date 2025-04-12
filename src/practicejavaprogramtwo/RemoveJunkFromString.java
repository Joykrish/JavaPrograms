package practicejavaprogramtwo;

public class RemoveJunkFromString {
	
	public static void main(String[] args) {
		String s1="dsfsd32433%&%&^%&^979 fii~~~++++}}}";
		String replaced=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("After replacing: "+replaced);
		String s2="@!!@#$%^&*(Pljsdls)((&(^*^";
		
		
		String newReplaced=s2.replaceAll("[^1-9a-zA-Z]", "");
		System.out.println(newReplaced);
	}

}
