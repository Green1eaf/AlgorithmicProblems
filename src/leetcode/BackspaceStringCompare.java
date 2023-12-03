package leetcode;

//  https://leetcode.com/problems/backspace-string-compare/

public class BackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));   //true
        System.out.println(backspaceCompare("ab##", "c#d#"));   //true
        System.out.println(backspaceCompare("a#c", "b"));       //false
    }

    public static boolean backspaceCompare(String s, String t) {
        return helper(s).equals(helper(t));
    }

    private static String helper(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#' && sb.length() != 0) {
                sb.deleteCharAt(sb.length() - 1);
            } else if (s.charAt(i) != '#') {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
