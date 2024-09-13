package youtubepractice;

public class PrintNumberUp10Recurssion {
	
	public static void main(String[] args) {
		printNumberUpto10(5);
	}

	public static void printNumberUpto10(int n) {
		if(n<=10) {
		System.out.println(n);
		printNumberUpto10(n+1);
	}
	}
}
