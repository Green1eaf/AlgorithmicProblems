package leetcode.firstSolutions;

//  https://leetcode.com/problems/single-number/

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
        System.out.println(singleNumber(new int[]{1}));
    }

    private static int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }
}
