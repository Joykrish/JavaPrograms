package leetcodeExersize;

import java.util.Arrays;

public class StringLongestCommonPrefix {
	
	public static void main(String[] args) {
		
		String[] arr= {"flower","flow","flight"};
		String str=longestCommonPrefix(arr);
		System.out.println(str);
		
		
	}

	
	
	    public static String longestCommonPrefix(String[] strs) {
	        int n = strs.length;
	        if (n == 0) return "";
	        // Sorting provides lexicographic order of strings.
	        Arrays.sort(strs);
	        String first = strs[0], last = strs[n - 1];
	        int i = 0;
	        while (i < first.length()) {
	            if (first.charAt(i) == last.charAt(i)) {
	                i += 1;
	            } else {
	                break;
	            }
	        }
	        return i == 0 ? "" : first.substring(0, i);
	    }
	}

