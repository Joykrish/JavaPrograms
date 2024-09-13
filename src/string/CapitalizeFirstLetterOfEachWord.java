package string;

public class CapitalizeFirstLetterOfEachWord {
	
	public static void main(String[] args) {
		String str="hare krishan govinda mukunda";
		String strCapital="";
		
		String[] arr=str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			String st=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
			
			strCapital+=st+" ";
		}
		System.out.println(strCapital);
		
	}

}
