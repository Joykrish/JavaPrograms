package string;

public class CountNumberOfWords {
	
	public static void main(String[] args) {
	String str="Radhaa Madhav Kunga Bihari Gopjan Vallabh girvardhari";
	//String[] st=str.split(" ");
	int count=1;
	//System.out.println(st.length);
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
			
			count++;
		}
	}
	System.out.println(count);
}
}