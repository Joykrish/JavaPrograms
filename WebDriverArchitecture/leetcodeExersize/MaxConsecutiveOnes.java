package leetcodeExersize;

public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		System.out.println(maxConsecutiveOnes(new int[] {1,0,1,1,1,0,1,1}));
	}

	public static int maxConsecutiveOnes(int[] arr) {
		int max = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
				max = Math.max(max, count);
			} else {
				count = 0;
			}
		}
		return max;
	}

}
