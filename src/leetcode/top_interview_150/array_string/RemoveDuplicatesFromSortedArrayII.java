package leetcode.top_interview_150.array_string;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(removeDuplicates(nums));
        for (var i : nums) {
            System.out.print(i + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 3) return nums.length;

        int index = 2;
        for (int i = index; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
