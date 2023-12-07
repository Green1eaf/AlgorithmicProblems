package leetcode.firstSolutions;

//  https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
        System.out.println(removeDuplicates("azxxzy"));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        stack.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!stack.empty() && stack.peek() == s.charAt(i)) stack.pop();
            else stack.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (var ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
