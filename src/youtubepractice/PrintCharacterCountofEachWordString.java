package youtubepractice;

public class PrintCharacterCountofEachWordString {
	
	
	public static void main(String[] args) {
		String str="hare Krishan Govinda Madhusudan";
		
		System.out.println("First Approach===============================");
		
		for(String st:str.split(" ")) {
			System.out.println(st.length());
		}
				
		System.out.println("Second Approach===============================");	
		
		
		char[] arr=str.toCharArray();
		
		//int i=0;
		for(int i=0;i<arr.length-1;i++) {
			String word="";
			while(i<arr.length && arr[i]!=' ') {
				word=word+arr[i];
				i++;
				
			}
			System.out.println(word.length());
		}
	}

}

