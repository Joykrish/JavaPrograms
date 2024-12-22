package leetcodeExersize;

public class StringIndexofFirstOccurance {
	
	public static void main(String[] args) {
		
		String s1 = "adbutsad", s2 = "sad";
		
		int k=0;
		for(int i=0; i<s1.length();i++) {
			
			for(int j=k;j<s2.length();j++) {
				
				if(s1.charAt(i)!=s2.charAt(k)) {
					break;
				}
				k++;
				if(s2.length()==k) {
					System.out.println("Substring found : "+k);
					break;
				}
			
		}
			
		
		
	}
		
		System.out.println("Occurance of substring is at index: "+s1.indexOf(s2));

	}
}

