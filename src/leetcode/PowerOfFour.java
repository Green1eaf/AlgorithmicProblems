package leetcode;

//  https://leetcode.com/problems/power-of-four/

public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(5));
        System.out.println(isPowerOfFour(1));
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 0) return false;
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                count++;
            } else break;
        }
        return n == 1 && count % 2 == 0;
    }
}
