package leetcode.top_interview_150.array_string;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(nums));
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] nums2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums2));
        for (var i : nums2) {
            System.out.print(i + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int pointer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[pointer] != nums[i]) {
                nums[++pointer] = nums[i];
            }
        }
        return pointer + 1;
    }
}
