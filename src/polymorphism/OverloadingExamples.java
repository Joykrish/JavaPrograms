package polymorphism;

public class OverloadingExamples {

	public static void main(String[] args) {

		OverloadingExamples os = new OverloadingExamples();
		os.add(0, 0);
		os.doLogin(324343, null);

	}

	public void add(int a, int b) {

	} 

	public int add(int a, int b) {

		return a;
	}

	public void add(int a, int b, int c) {

	}

	public void doLogin(int phoneNumber, String password) {

	}

	public void doLogin(String userName, String password) {

	}

}
