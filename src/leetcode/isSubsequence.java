package leetcode;

//  https://leetcode.com/problems/is-subsequence/

public class isSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int indexS = 0;
        int indexT = 0;
        while (indexS < s.length() && indexT < t.length()) {
            if (s.charAt(indexS) == t.charAt(indexT)) indexS++;
            indexT++;
        }
        return indexS == s.length();
    }
}

