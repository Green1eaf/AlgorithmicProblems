package leetcode.top_interview_150.binary_search;

public class FindPeakElement {
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1, 2, 3, 1}));
        System.out.println(findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }

    public static int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2]) return nums.length - 1;
        int l = 1;
        int r = nums.length - 2;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) return mid;
            else if (nums[mid - 1] > nums[mid]) r = mid - 1;
            else if (nums[mid + 1] > nums[mid]) l = mid + 1;
        }
        return -1;
    }
}
