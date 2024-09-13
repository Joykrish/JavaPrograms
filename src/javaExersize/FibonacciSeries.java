package javaExersize;

public class FibonacciSeries {

	public static void main(String[] args) {
		int limit=10;
		int n1=0;
		int n2=1;
		int sum=0;
	
		for(int i=1;i<limit;i++) {
			System.out.print(n1+ " ");
			sum=n1+n2;
			n1=n2;
			n2=sum;
			
		}
		
		
	}
}
