package leetcode.firstSolutions;

//  https://leetcode.com/problems/sqrtx/

public class SqrtX {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        if (x < 2) return x;
        int l = 1;
        int r = x / 2;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid * mid == x) return mid;
            if ((long) mid * mid > (long) x) r = mid - 1;
            else l = mid + 1;
        }
        return r;
    }
}
