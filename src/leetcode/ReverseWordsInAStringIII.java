package leetcode;

//  https://leetcode.com/problems/reverse-words-in-a-string-iii/

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("God Ding"));
    }

    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (var ch : s.toCharArray()) {
            if (ch != ' ') {
                sb.append(ch);
            } else {
                ans.append(sb.reverse()).append(' ');
                sb = new StringBuilder();
            }
        }
        ans.append(sb.reverse());
        return ans.toString();
    }
}
