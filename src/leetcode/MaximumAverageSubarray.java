package leetcode;

// https://leetcode.com/problems/maximum-average-subarray-i/

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{7, 4, 5, 8, 8, 3, 9, 8, 7, 6}, 7));
    }

    public static double findMaxAverage(int[] nums, int k) {
        float sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        float avg = sum / k;
        for (int i = k; i < nums.length; i++) {
            sum = (sum - nums[i - k] + nums[i]);
            if (avg < sum / k) {
                avg = sum / k;
            }
        }
        return avg;
    }
}
