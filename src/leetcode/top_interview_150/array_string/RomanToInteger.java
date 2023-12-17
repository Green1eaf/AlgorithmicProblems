package leetcode.top_interview_150.array_string;

//  https://leetcode.com/problems/roman-to-integer

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));  //3
        System.out.println(romanToInt("LVIII"));    //58
        System.out.println(romanToInt("MCMXCIV"));  //1994
    }

    public static int romanToInt(String s) {
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int num = helper(s.charAt(i));
            ans = i < s.length() - 1 && num < helper(s.charAt(i + 1)) ? ans - num : ans + num;
        }
        return ans;
    }

    private static int helper(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
