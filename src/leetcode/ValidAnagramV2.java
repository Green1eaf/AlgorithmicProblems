package leetcode;

//  https://leetcode.com/problems/valid-anagram/

import java.util.Arrays;

public class ValidAnagramV2 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
        System.out.println(isAnagram("aa", "bb"));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        var arrS = s.toCharArray();
        var arrT = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        return Arrays.equals(arrS, arrT);
    }
}
