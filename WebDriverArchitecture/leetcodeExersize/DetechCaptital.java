package leetcodeExersize;

public class DetechCaptital {

	public static void main(String[] args) {
		
		System.out.println(detectCaptitalUse("HarE"));
		
		
	}

	
	public static boolean detectCaptitalUse(String word) {
		if (allUpper(word) || allLower(word) || isTitleCase(word)) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean allUpper(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isUpperCase(ch)) {
				count++;

			}

			if (word.length() == count) {
				return true;
			}

		}
		return false;
	}

	public static boolean allLower(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isLowerCase(ch)) {
				count++;

			}

			if (word.length() == count) {
				return true;
			}

		}
		return false;
	}

	public static boolean isTitleCase(String word) {
		char firstChar = word.charAt(0);
		String restString = word.substring(1, word.length());

		if (Character.isUpperCase(firstChar) && allLower(restString)) {
			return true;
		}
		return false;

	}
}
