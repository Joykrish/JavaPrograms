package javaExersize;

public class Factorial {
public static void main(String[] args) {
	int number=4;
	
	System.out.println(factorial(number));
}

public static int factorial(int n) {
	int multiplication=1;
	for(int i=1;i<=n;i++) {
		multiplication=multiplication*i;
	}
	return multiplication;
}
}
