package youtubepractice;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int n1 = 0,n2 = 1;
		
		for(int i=1;i<10;i++) {
			
			System.out.print(n1+" ");
			int sum=n1+n2;
			n1=n2;
			n2=sum;
		}
	}

}
  