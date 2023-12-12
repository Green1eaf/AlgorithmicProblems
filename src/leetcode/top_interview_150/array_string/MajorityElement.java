package leetcode.top_interview_150.array_string;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 3, 4}));
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (var i : nums) {
            if (count == 0) {
                candidate = i;
            }
            if (i == candidate) count++;
            else count--;
        }
        return candidate;
    }
}
