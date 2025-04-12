package practicejavaprogramtwo;

public class CompareTwoStrings {
	
	public static void main(String[] args) {
		String s1="Krishna";
		String s2="Krishna";
		boolean  iscompare=false;
		
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		
		if(arr1.length!=arr2.length) {
			iscompare=false;  
			
		}
		else {
		
		for(int i=0;i<arr1.length;i++) {    
			if(arr1[i]!=arr2[i]) {
				iscompare=false;
				break;
					
			}
			iscompare=true;
			
		}
		}
		System.out.println("both the strings are equal"+iscompare);
	}

}
