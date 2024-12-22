package leetcodeExersize;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
	
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		System.out.println(isValid(s));
		
	}
	
	 
	    public static boolean isValid(String s) {
	        if (Objects.isNull(s) || s.isEmpty() || s.length() < 2) {
	            return false;
	        }
	        Stack<Character> stack = new Stack<>();
	        for (char c : s.toCharArray()) {
	            if (Objects.equals(c, '(') || Objects.equals(c, '[') || Objects.equals(c, '{')) {
	                stack.push(c);
	            } else {
	                if (stack.isEmpty()) {
	                    return false; 
	                }
	                char last = stack.pop();
	                if (Objects.equals(c, ')') && !Objects.equals(last, '(')) {
	                    return false;
	                }
	                if (Objects.equals(c, ']') && !Objects.equals(last, '[')) {
	                    return false;
	                }
	                if (Objects.equals(c, '}') && !Objects.equals(last, '{')) {
	                    return false;
	                }
	            }
	        }
	        return stack.isEmpty();
	    }
	}


