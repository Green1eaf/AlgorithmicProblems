package leetcode.top_interview_150.hashmap;

//  https://leetcode.com/problems/valid-anagram/

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        var arrS = s.toCharArray();
        var arrT = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        return Arrays.equals(arrS, arrT);
    }
}
