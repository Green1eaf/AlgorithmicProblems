package leetcode;

//  https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println("answer: 2 1 4");
    }

    private static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        do {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) r = mid - 1;
            else l = mid + 1;
        } while (l <= r);
        return l;
    }
}
