package leetcode.top_interview_150.intervals;

//  https://leetcode.com/problems/summary-ranges

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println(summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i]);
            if (i < nums.length - 1 && nums[i + 1] - nums[i] == 1) {
                while (i < nums.length - 1 && nums[i + 1] - nums[i] == 1) i++;
                sb.append("->").append(nums[i]);
            }
            ans.add(sb.toString());
        }
        return ans;
    }
}
