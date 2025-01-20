package leetcodeExersize;

public class NegativeNumberinStortedMatrix {
	
	public static void main(String [] args) {
		int [] []arr= {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		System.out.println(negativeNumber(arr));
	}
	
	public static int negativeNumber(int [] []arr) {
		
		int totalRows=arr.length;
		
		int totalCols=arr[0].length;
		
		int row=0,col=totalCols-1,count=0;
		
		while(row<totalRows &&col>=0) {
			if(arr[row][col]<0) {
				col--;
				count=count+totalRows-row;
			}
			else {
				row++;
			}
		}
		
		return count;
		
	}

}
