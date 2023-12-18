package leetcode.top_interview_150.hashmap;

//  https://leetcode.com/problems/ransom-note

import java.util.Arrays;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b")); //false
        System.out.println(canConstruct("aa", "ab"));   //false
        System.out.println(canConstruct("aa", "aab"));  //true
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        var sortRansom = ransomNote.toCharArray();
        Arrays.sort(sortRansom);
        var sortMag = magazine.toCharArray();
        Arrays.sort(sortMag);
        int pointer = 0;
        for (var i : sortMag) {
            if (i == sortRansom[pointer]) pointer++;
            if (pointer == sortRansom.length) return true;
        }
        return false;
    }
}
