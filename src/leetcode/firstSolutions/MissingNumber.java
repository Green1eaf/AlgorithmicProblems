package leetcode.firstSolutions;

//  https://leetcode.com/problems/missing-number

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3, 0, 1}));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int pointer = 0;
        for (var i : nums) {
            if (i != pointer) return pointer;
            pointer++;
        }
        return pointer;
    }
}
