package multiThreadingUdemy.stack.problems;

public class BalanceChecker {

	public static boolean balanceChecker(String str) throws Exception {
		Linkedstack stack = new Linkedstack();

		for (int i = 0; i < str.length(); i++) {
			
			char x = str.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}

			if (stack.isEmpty()) {
				return false;
			}

			char y;

			switch (x) {
			case ')':
				y = stack.pop();
				if (y == '{' || y == '[') {
					return false;
				}
				break;

			case ']':
				y = stack.pop();
				if (y == '{' || y == '(') {
					return false;
				}
				break;

			case '}':
				y = stack.pop();
				if (y == '(' || y == '[') {
					return false;
				}
				break;
			}
		}
		return (stack.isEmpty());
	}

	public static void main(String[] args) throws Exception {
		System.out.println(balanceChecker("{}[]()"));

	}

}
