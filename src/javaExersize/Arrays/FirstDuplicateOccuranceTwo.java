package javaExersize.Arrays;

public class FirstDuplicateOccuranceTwo {

	public static void  main(String[] args) {
		
		String [] fruits= {"apple","banana","grapes","pinapple","banana","orange"};
		
		for(int i=0;i<fruits.length;i++) {
			for(int j=i+1;j<fruits.length;j++) {
				if(fruits[i]==fruits[j]) {
					System.out.println(fruits[i]);
				}
			}
		}
	}
}
