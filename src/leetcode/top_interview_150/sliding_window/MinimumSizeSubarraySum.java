package leetcode.top_interview_150.sliding_window;

//  https://leetcode.com/problems/minimum-size-subarray-sum/

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3})); //2
        System.out.println(minSubArrayLen(4, new int[]{1, 4, 4}));  //1
        System.out.println(minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));  //0
        System.out.println(minSubArrayLen(15, new int[]{1, 2, 3, 4, 5}));  //5
        System.out.println(minSubArrayLen(6, new int[]{10, 2, 3}));  //1
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int fast = 0;
        int slow = 0;
        while (fast < nums.length) {
            if (sum >= target) {
                ans = Math.min(ans, fast - slow);
                sum -= nums[slow++];
            } else sum += nums[fast++];
        }
        while (sum >= target) {
            ans = Math.min(ans, fast - slow);
            sum -= nums[slow++];
        }
        return ans > nums.length ? 0 : ans;
    }
}
