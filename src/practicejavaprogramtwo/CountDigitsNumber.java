package practicejavaprogramtwo;

public class CountDigitsNumber {
	
	public static void main(String[] args) {
		int num=1234534;
		
		int count=0;
		while(num>0) {
			int digit=num/10;
			num=num/10;
			count++;
		}
		
		System.out.println("number of digits are: "+count);
	}

}
