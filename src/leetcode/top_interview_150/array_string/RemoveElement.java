package leetcode.top_interview_150.array_string;

//  https://leetcode.com/problems/remove-element/

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums, val));
        for (var i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] nums1 = new int[]{2, 2, 3};
        int val1 = 2;
        System.out.println(removeElement(nums1, val1));
        for (var i : nums1) {
            System.out.print(i + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int k = nums.length;
        for (int i = 0; i < k; i++) {
            if (nums[k - 1] == val) {
                k--;
                i--;
                continue;
            }
            if (nums[i] == val) {
                int temp = nums[k - 1];
                nums[k-- - 1] = nums[i];
                nums[i] = temp;
            }
        }
        return k;
    }
}
