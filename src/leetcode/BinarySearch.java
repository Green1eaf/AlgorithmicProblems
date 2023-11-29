package leetcode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{5};
        System.out.println(search(nums, 5) == 0);
        nums = new int[]{-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 2) == -1);
    }

    private static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int index = (r - l) / 2;
        while (l <= r) {
            if (nums[index] == target) return index;
            else if (target < nums[index]) r = index - 1;
            else l = index + 1;
            index = l + (r - l) / 2;
        }
        return -1;
    }
}
