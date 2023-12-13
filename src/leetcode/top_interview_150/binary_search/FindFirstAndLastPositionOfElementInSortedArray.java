package leetcode.top_interview_150.binary_search;

//  https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        for (var i : searchRange(nums, 8)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (var i : searchRange(nums, 6)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (var i : searchRange(new int[]{}, 0)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (var i : searchRange(new int[]{1}, 1)) {
            System.out.print(i + " ");
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        ans[0] = binarySearch(nums, target, true);
        ans[1] = binarySearch(nums, target, nums.length == 1);
        return ans;
    }

    private static int binarySearch(int[] nums, int target, boolean isLeft) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target && (mid == 0 || nums[mid - 1] != target) && isLeft) return mid;
            if (nums[mid] == target && (mid >= nums.length - 1 || nums[mid + 1] != target) && !isLeft) return mid;
            if (isLeft) {
                if (nums[mid] >= target) r = mid - 1;
                else l = mid + 1;
            } else {
                if (nums[mid] <= target) l = mid + 1;
                else r = mid - 1;
            }
        }
        return -1;
    }
}
