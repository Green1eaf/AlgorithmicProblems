package leetcode;

//  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class findNumbersWIthEvenNumberOfDigits {
    public static void main(String[] args) {
        System.out.println(findNumber(new int[]{12, 345, 2, 6, 7896}));
    }

    public static int findNumber(int[] nums) {
        int result = 0;
        for (var i : nums) {
            if (Integer.toString(i).length() % 2 == 0) result++;
        }
        return result;
    }
}
