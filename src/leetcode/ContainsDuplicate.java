package leetcode;

// https://leetcode.com/problems/contains-duplicate/

import org.junit.jupiter.api.Assertions;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Assertions.assertTrue(containsDuplicate(new int[]{1, 2, 3, 1}));
        Assertions.assertFalse(containsDuplicate(new int[]{1, 2, 3, 4}));
        Assertions.assertTrue(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
        System.out.println("Задача решена успешно!");
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if(seen.contains(num)) return true;
            seen.add(num);
        }
        return false;
    }
}
