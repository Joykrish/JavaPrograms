package practice;

public class FirstNonRepeatedCharString {

	public static void main(String[] args) {
		String str = "HareKrishna";
		String converted = str.toLowerCase();
		boolean nonrepeatable = false;
		for (int i = 0; i < converted.length(); i++) {
			for (int j = i + 1; j < converted.length(); j++) {
				if (converted.charAt(i) != converted.charAt(j)) {

					nonrepeatable = true;
				}

			}
			if (nonrepeatable) {
				System.out.println("Non repeatable is" + converted.charAt(i));
				break;
			}
		}

	}

}
