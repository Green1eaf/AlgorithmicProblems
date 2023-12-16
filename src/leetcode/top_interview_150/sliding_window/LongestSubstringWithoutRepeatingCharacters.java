package leetcode.top_interview_150.sliding_window;

//  https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));   //3
        System.out.println(lengthOfLongestSubstring("bbbbb"));  //1
        System.out.println(lengthOfLongestSubstring("pwwkew")); //3
        System.out.println(lengthOfLongestSubstring(" ")); //1
    }

    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int start = 0;
        int end = 0;
        Set<Character> set = new HashSet<>();
        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end++));
                ans = Math.max(ans, end - start);
            } else {
                while (s.charAt(start++) != s.charAt(end)) ;
                end = start;
                set.clear();
            }
        }
        return ans;
    }
}
