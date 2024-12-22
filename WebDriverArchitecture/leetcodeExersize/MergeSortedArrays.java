package leetcodeExersize;

public class MergeSortedArrays {
    
    /**
     * Merges two sorted arrays nums1 and nums2 into nums1 in-place.
     * 
     * @param nums1 The first array with extra space to hold the elements from nums2.
     * @param m The number of initialized elements in nums1.
     * @param nums2 The second array.
     * @param n The number of elements in nums2.
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for the merged array (end of nums1)

        // Merge nums1 and nums2 starting from the back
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // Main method to test the merge logic
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        System.out.println("Before Merge:");
        printArray(nums1);
        merge(nums1, m, nums2, n);
        System.out.println("After Merge:");
        printArray(nums1); // Expected: [1, 2, 2, 3, 5, 6]

        // Test case 2
        nums1 = new int[]{1};
        m = 1;
        nums2 = new int[]{};
        n = 0;
        System.out.println("\nBefore Merge:");
        printArray(nums1);
        merge(nums1, m, nums2, n);
        System.out.println("After Merge:");
        printArray(nums1); // Expected: [1]

        // Test case 3
        nums1 = new int[]{0};
        m = 0;
        nums2 = new int[]{1};
        n = 1;
        System.out.println("\nBefore Merge:");
        printArray(nums1);
        merge(nums1, m, nums2, n);
        System.out.println("After Merge:");
        printArray(nums1); // Expected: [1]
    }
}
