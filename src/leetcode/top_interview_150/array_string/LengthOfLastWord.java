package leetcode.top_interview_150.array_string;

//  https://leetcode.com/problems/length-of-last-word/

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));    //5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));    //4
        System.out.println(lengthOfLastWord("luffy is still joyboy"));  //6
    }

    public static int lengthOfLastWord(String s) {
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isLetter(s.charAt(i))) {
                ans++;
            } else if (ans != 0) break;
        }
        return ans;
    }
}
