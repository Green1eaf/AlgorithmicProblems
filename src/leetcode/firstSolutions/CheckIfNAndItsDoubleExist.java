package leetcode.firstSolutions;

//  https://leetcode.com/problems/check-if-n-and-its-double-exist/

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{7, 1, 14, 11}));
    }

    public static boolean checkIfExist(int[] arr) {
        Set<Double> set = new HashSet<>();
        for (int i : arr) {
            if (i == 0 && set.contains(i)) return true;
            if (set.contains((double) i * 2) || set.contains((double) i / 2)) return true;
            set.add((double) i);
        }
        return false;
    }
}
