package leetcode.top_interview_150.array_string;

//  https://leetcode.com/problems/integer-to-roman/

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));  //III
        System.out.println(intToRoman(58)); //LVIII
        System.out.println(intToRoman(1994));   //MCMXCIV
    }

    public static String intToRoman(int num) {
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hndr = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thds = {"", "M", "MM", "MMM"};
        return thds[num / 1000] + hndr[(num % 1000) / 100] + tens[(num % 100) / 10] + ones[num % 10];
    }
}
