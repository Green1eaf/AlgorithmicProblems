package leetcode.firstSolutions;

//  https://leetcode.com/problems/pascals-triangle/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    private static List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return Collections.emptyList();
        if (numRows == 1) return List.of(List.of(1));
        List<List<Integer>> ans = new ArrayList<>(List.of(List.of(1)));
        for (int i = 1; i < numRows; i++) {
            ans.add(helper(ans.get(i - 1)));
        }
        return ans;
    }

    private static List<Integer> helper(List<Integer> list) {
        List<Integer> result = new ArrayList<>(List.of(1));
        for (int i = 1; i < list.size(); i++) {
            result.add(list.get(i - 1) + list.get(i));
        }
        result.add(1);
        return result;
    }
}
