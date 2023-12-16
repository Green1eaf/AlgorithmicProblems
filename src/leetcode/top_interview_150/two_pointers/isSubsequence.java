package leetcode.top_interview_150.two_pointers;

//  https://leetcode.com/problems/is-subsequence/

public class isSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc")); //true
        System.out.println(isSubsequence("axc", "ahbgdc")); //false
    }

    public static boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;
        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++;
        }
        return sPointer == s.length();
    }
}
