package practicejavaprogramtwo;

public class LongestUniqueSubstring2 {
    public static void main(String[] args) {
        String str = "abcabcbb";
        String result = "";

        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = String.valueOf(str.charAt(i));

            if (temp.contains(ch)) {
                temp = temp.substring(temp.indexOf(ch) + 1);
            }

            temp = temp + ch;

            if (temp.length() > result.length()) {
                result = temp;
            }
        }

        System.out.println("Longest substring without repeating characters: " + result);
    }
}




