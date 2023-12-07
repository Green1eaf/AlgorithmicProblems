package leetcode.firstSolutions;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));
    }

    public static boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        long l = 1;
        long r = num / 2;
        while (l <= r) {
            long mid = (r + l) / 2;
            long sqr = mid * mid;
            if (sqr == num) return true;
            if (sqr < num) l = mid + 1;
            else r = mid - 1;
        }
        return false;
    }
}
