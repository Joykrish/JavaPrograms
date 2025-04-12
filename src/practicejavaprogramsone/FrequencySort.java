package practicejavaprogramsone;

import java.util.*;

public class FrequencySort {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 4, 4, 4};

        int[] sortedArr = sortByFrequency(arr);

        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] sortByFrequency(int[] arr) { 
        // Step 1: Count frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a list of elements and sort by frequency
        List<Integer> elements = new ArrayList<>(frequencyMap.keySet());
        elements.sort((a, b) -> {
            int freqCompare = frequencyMap.get(b) - frequencyMap.get(a); // Descending frequency
            if (freqCompare == 0) {
                return a - b; // Optional: Ascending order for values with the same frequency
            }
            return freqCompare;
        });

        // Step 3: Rebuild the array based on sorted order
        List<Integer> sortedList = new ArrayList<>();
        for (int num : elements) {
            int freq = frequencyMap.get(num);
            for (int i = 0; i < freq; i++) {
                sortedList.add(num);
            }
        }

        // Convert List to array
        return sortedList.stream().mapToInt(i -> i).toArray();
    }
}

