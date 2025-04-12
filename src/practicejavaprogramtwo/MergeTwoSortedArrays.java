package practicejavaprogramtwo;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {2, 4, 6, 8};

        int as = a.length;
        int bs = b.length;

        int[] c = new int[as + bs];

        int i = 0, j = 0, k = 0;

        // Merging both arrays while elements are remaining in both
        while (i < as && j < bs) {
            if (a[i] <= b[j]) {  // ✅ Fixed: Use b[j] instead of b[i]
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from a[]
        while (i < as) {
            c[k] = a[i];
            i++;
            k++;
        }

        // Copy any remaining elements from b[]
        while (j < bs) {
            c[k] = b[j];
            j++;
            k++;
        }

        // Print the merged sorted array
        System.out.println(Arrays.toString(c));
    }
}
