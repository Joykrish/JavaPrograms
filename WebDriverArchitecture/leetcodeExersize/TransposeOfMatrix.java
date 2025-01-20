package leetcodeExersize;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int rows = arr.length;
		int col = arr[0].length;

		int transpose[][] = new int[col][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				transpose[i][j] = arr[j][i];
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {

				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}

	}

}
