package leetcode.binary_search;

//  https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));   //{2}
        System.out.println(Arrays.toString(intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));   //{9, 4}
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (var i : nums1) {
            set.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (var i : nums2) {
            if (set.contains(i)) set2.add(i);
        }
        int[] ans = new int[set2.size()];
        int index = 0;
        for (var i : set2) {
            if (set2.contains(i)) ans[index++] = i;
        }
        return ans;
    }
}
