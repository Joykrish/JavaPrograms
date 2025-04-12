package practicejavaprogramtwo;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {

		String str = "harekrishnaradha";
		System.out.println(removedDuplicate(str));
	}

	public static String removedDuplicate(String str) {
		Set<Character> set = new HashSet<Character>();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (!set.contains(c)) {
				set.add(c);
				sb.append(c);

			}
  
		}
		return sb.toString();
	}
}
