package string;

public class ReverseWordsinString {
	
	public static void main(String[] args) {
		String str="Radhaa Madhav Kunga Bihari Gopjan Vallabh girvardhari";
		
		String[] st=str.split(" ");
		
		for(int i=st.length-1;i>=0;i--) {
			System.out.print(st[i] +" ");
		}
	}

}
