package leetcode.top_interview_150.array_string;

//  https://leetcode.com/problems/integer-to-roman

public class IntegerToRomanV2 {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));  //III
        System.out.println(intToRoman(58)); //LVIII
        System.out.println(intToRoman(1994));   //MCMXCIV
    }

    public static String intToRoman(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] str = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        var sb = new StringBuilder();
        int i = 0;
        while (num > 0) {
            if (num >= nums[i]) {
                sb.append(str[i]);
                num -= nums[i];
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
