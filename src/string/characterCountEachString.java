package string;

public class characterCountEachString {
	
	public static void main(String[] args) {
	
	 String str="Hare Krishna Hare Rama Govinda";
	
	String[] str1= str.split(" ");	
	
	for(String st:str1) {
		System.out.println(st +":"+st.length());
	}
	

}
}
