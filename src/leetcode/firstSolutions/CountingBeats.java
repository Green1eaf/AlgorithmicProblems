package leetcode.firstSolutions;

// https://leetcode.com/problems/counting-bits/

public class CountingBeats {
    public static void main(String[] args) {
        int[] arr = countBits(5);
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
    }
    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}
