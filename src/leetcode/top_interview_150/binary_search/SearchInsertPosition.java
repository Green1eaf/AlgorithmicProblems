package leetcode.top_interview_150.binary_search;

//  https://leetcode.com/problems/search-insert-position/

/**
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 */

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5)); //2
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2)); //1
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7)); //4
    }

    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target == nums[mid]) return mid;
            if (target > nums[mid]) l = mid + 1;
            else r = mid - 1;
        }
        return l;
    }
}
