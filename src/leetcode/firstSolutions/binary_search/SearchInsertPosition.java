package leetcode.firstSolutions.binary_search;

//  https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));    //2
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));    //1
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));    //4
    }

    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        do {
            int middle = l + (r - l) / 2;
            if (nums[middle] == target) return middle;
            if (nums[middle] < target) l = middle + 1;
            else r = middle - 1;
        } while (l <= r);
        return l;
    }
}
