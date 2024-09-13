package practice;

public class TwoStringsRotational {
	public static void main(String[] args) {
		System.out.println(isRotatedVersion("abcd", "dbac"));
	}

	public static boolean isRotatedVersion(String OriginalString, String RotatedString) {

		if (OriginalString == null || RotatedString == null) {
			return false;
		} else if (OriginalString.length() != RotatedString.length()) {
			return false;
		} else {
			String concatinatedString = OriginalString + OriginalString;
			return concatinatedString.contains(RotatedString);
		}
	}
}
