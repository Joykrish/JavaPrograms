package pattern;

public class SandGlassStar2 {
	
	public static void main(String[] args) {
		for(int i=6;i>=0;i--) {
			for(int j=6-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}   
		
		for(int i=6;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=6-i;k>=0;k--) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
