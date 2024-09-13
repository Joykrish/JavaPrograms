package pattern;

public class RightTriangleStar {
	
	public static void main(String[] args) {
		int limit=6;
		for(int i=1;i<=limit;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
