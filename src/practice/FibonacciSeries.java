package practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		int first=0;
		int second=1;
		
		int limit=10;
		
		for(int i=0;i<limit;i++) {
			System.out.print(first+ " ");
			int third=first+second;
			first=second;
			second=third;
			
		}
	}
}
  