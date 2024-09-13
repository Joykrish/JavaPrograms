package pattern;

public class RightPascaltriangleStarPattern {
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int x=4;x>=1;x--) {
		for(int k=1;k<=x;k++) {
			System.out.print("* ");
		}
		
		System.out.println();
}
}
}