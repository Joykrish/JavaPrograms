package pattern;

public class LeftTriangleStarPattern {

	public static void main(String[] args) {
		int limit=5;
		for(int i=1;i<=limit;i++) {
			for(int j=limit;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=  i;k++) {
			System.out.print("*");
			}
			System.out.println();
			
		}
	}
	

}
