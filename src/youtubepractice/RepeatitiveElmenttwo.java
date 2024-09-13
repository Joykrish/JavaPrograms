package youtubepractice;

public class RepeatitiveElmenttwo {
	public static void main(String[] args) {
		int [] arr= {2,5,4,6,7,7,4,2,3};
		
		int[] temp=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			if(temp[arr[i]]==1) {
				System.out.println("Repeatitive  element is:"+arr[i]);
			
		}
			else {
				temp[arr[i]]=1;
			}
		
	}

}
}