package leetcode.top_interview_150.hashmap;

//  https://leetcode.com/problems/two-sum

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        var ans = twoSum(new int[]{2, 7, 11, 15}, 9);
        for (var i : ans) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) return new int[]{map.get(temp), i};
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
