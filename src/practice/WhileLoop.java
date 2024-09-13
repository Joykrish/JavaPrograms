package practice;

public class WhileLoop {
	public static void main(String[] args) {
		String str = "We a have large inventory of things in our warehouse falling in"
				+ "the category:appearl and the slightly"
				+ "more in demand category:markup along with the category:furtniture and -- ";
		printCategories(str);
	}

	public static void printCategories(String str) {

		int i = 0;
		while (true) {
			int found = str.indexOf("category", i);
			if (found == -1) {
				break;
			}

			int start = found + 9;
			int end = str.indexOf(" ", start);
			System.out.println(str.substring(start, end));
			i = end + 1;
		}

	}

}
