package leetcode;

//  https://leetcode.com/problems/single-number/

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
        System.out.println(singleNumber(new int[]{1}));
    }

    private static int singleNumber(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.get(i) == null);
        }
        for (var val : map.entrySet()) {
            if (val.getValue()) return val.getKey();
        }
        return 0;
    }
}
