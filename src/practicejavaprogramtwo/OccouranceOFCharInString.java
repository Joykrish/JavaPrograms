package practicejavaprogramtwo;

public class OccouranceOFCharInString {
	public static void main(String[] args) {
		String mantra="HareKrishna";
		String tobecounted="s";
		
		int lenghtOriginal=mantra.length();
		String afterReplace=mantra.replace(tobecounted, "");
		int lengthafter=afterReplace.length();
		
		System.out.println("Number of occurance is"+(lenghtOriginal-lengthafter));
		
		
	}

}
