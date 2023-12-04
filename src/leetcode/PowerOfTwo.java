package leetcode;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(3));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        while (n > 1) {
            if (n % 2 != 0) return false;
            n /= 2;
        }
        return true;
    }
}
