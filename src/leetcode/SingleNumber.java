package leetcode;

//  https://leetcode.com/problems/single-number/

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
        System.out.println(singleNumber(new int[]{1}));
    }

    private static int singleNumber(int[] nums) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                result -= i;
                set.remove(i);
            } else {
                result += i;
                set.add(i);
            }
        }
        return result;
    }
}
