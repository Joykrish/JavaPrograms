package practicejavaprogramsone;

import java.util.*;

public class StringLengthSort {
    public static void main(String[] args) {
        String[] strings = {"apple", "bat", "cat", "banana", "pear", "kiwi"};

        // Sorting strings by length in ascending order
        Arrays.sort(strings, (a, b) -> a.length() - b.length());

        System.out.println("Sorted by length (ascending): " + Arrays.toString(strings));

        // Sorting strings by length in descending order
        Arrays.sort(strings, (a, b) -> b.length() - a.length());

        System.out.println("Sorted by length (descending): " + Arrays.toString(strings));
    }
}
 