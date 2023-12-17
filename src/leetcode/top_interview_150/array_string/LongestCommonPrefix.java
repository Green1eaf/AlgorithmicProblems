package leetcode.top_interview_150.array_string;

//  https://leetcode.com/problems/longest-common-prefix

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));  //fl
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));     //""
    }

    public static String longestCommonPrefix(String[] strs) {
        var sb = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) return sb.toString();
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }
}
