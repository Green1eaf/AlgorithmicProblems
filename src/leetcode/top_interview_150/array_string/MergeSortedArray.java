package leetcode.top_interview_150.array_string;

//  https://leetcode.com/problems/merge-sorted-array/

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        for (var i : nums1) {
            System.out.println(i + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0 && m == 0) return;
        while (true) {
            if (n == 0) return;
            if (m == 0) {
                for (int i = n; i > 0; i--) {
                    nums1[i - 1] = nums2[n-- - 1];
                }
                return;
            }
            nums1[n + m - 1] = nums1[m - 1] > nums2[n - 1] ? nums1[m-- - 1] : nums2[n-- - 1];
        }
    }
}
