package leetcode.firstSolutions;

//  https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            if (!Character.isLetterOrDigit(s.charAt(l))) l++;
            else if (!Character.isLetterOrDigit(s.charAt(r))) r--;
            else {
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
                l++;
                r--;
            }
        }
        return true;
    }
}
