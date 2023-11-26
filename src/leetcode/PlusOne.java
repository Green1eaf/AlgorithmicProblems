package leetcode;

//  https://leetcode.com/problems/plus-one/

public class PlusOne {
    public static void main(String[] args) {
        var result = plusOne(new int[]{1, 2, 3});
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] plusOne(int[] digits) {
        for (int i : digits) {
            if (i != 9) {
                helper(digits);
                return digits;
            }
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }

    public static void helper(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 9) {
                arr[i] = 0;
            } else {
                arr[i]++;
                break;
            }
        }
    }
}
