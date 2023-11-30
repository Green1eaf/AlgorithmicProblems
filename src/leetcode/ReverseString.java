package leetcode;

//  https://leetcode.com/problems/reverse-string/

public class ReverseString {
    public static void main(String[] args) {
        var arr = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(arr);
        for (var c : arr) {
            System.out.print(c);
        }
    }

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
