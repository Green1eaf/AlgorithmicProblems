package leetcode.top_interview_150.two_pointers;

//  https://leetcode.com/problems/two-sum-ii-input-array-is-sorted

public class TowSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        for (var i : twoSum(new int[]{2, 7, 11, 15}, 9)) {  // 1, 2
            System.out.print(i + " ");
        }
        System.out.println();
        for (var i : twoSum(new int[]{2, 3, 4}, 6)) {   // 1, 3
            System.out.print(i + " ");
        }
        System.out.println();
        for (var i : twoSum(new int[]{-1, 0}, -1)) {    // 1, 2
            System.out.print(i + " ");
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            if (numbers[start] + numbers[end] == target) return new int[]{start + 1, end + 1};
            if (numbers[start] + numbers[end] > target) end--;
            else start++;
        }
        return new int[]{-1, -1};
    }
}
