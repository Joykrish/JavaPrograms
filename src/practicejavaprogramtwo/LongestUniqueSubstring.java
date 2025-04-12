package practicejavaprogramtwo;

import java.util.HashSet;

public class LongestUniqueSubstring {

    public static void main(String[] args) {
        String str = "abcabcbb";
        String longest = findLongestUniqueSubstring(str);
        System.out.println("Longest substring without repeating characters: " + longest);
    }

    public static String findLongestUniqueSubstring(String str) {
        int left = 0, right = 0;
        int maxLength = 0;
        int start = 0;

        HashSet<Character> set = new HashSet<>();

        while (right < str.length()) { 
            char ch = str.charAt(right);

            if (!set.contains(ch)) {
                set.add(ch);
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    start = left;
                }
                right++;
            } else {
                set.remove(str.charAt(left));
                left++;
            }
        }

        return str.substring(start, start + maxLength);
    }
}
