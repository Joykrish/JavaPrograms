package javaExersize;

public class MulitiplicationwithoutOperator {
	
	public static void main(String[] args) {
		
		System.out.println(mulitiplyusingfor(4,8));
		System.out.println(mulitiplyusingwhile(4,2));
	}
		
	public static int mulitiplyusingfor(int a,int b){
		int sum=0;
		for(int i=1;i<=b;i++) {
			sum=sum+a;
		}
		
		
		return sum;
			
		}
	
	public static int mulitiplyusingwhile(int a,int b) {
		int i=1;
		int sum=0;
		while(i<=b) {
			sum=sum+a;
			i++;
		}
		
		
		return sum;
		
	}
	}



