package leetcode.top_interview_150.two_pointers;

//  https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); //true
        System.out.println(isPalindrome("Race a car")); //false
    }

    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            if (!Character.isLetterOrDigit(s.charAt(l))) l++;
            else if (!Character.isLetterOrDigit(s.charAt(r))) r--;
            else if (s.toLowerCase().charAt(l) != s.toLowerCase().charAt(r)) return false;
            else {
                l++;
                r--;
            }
        }
        return true;
    }
}
