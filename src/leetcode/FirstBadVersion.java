package leetcode;

//  https://leetcode.com/problems/first-bad-version/

public class FirstBadVersion {
    private static int FIRST_BAD_VERSION = 0;

    public static void main(String[] args) {
        FIRST_BAD_VERSION = 4;
        System.out.println(firstBadVersion(5));
        FIRST_BAD_VERSION = 1;
        System.out.println(firstBadVersion(1));
    }

    public static int firstBadVersion(int n) {
        int l = 0;
        int r = n;
        do {
            int mid = l + (r - l) / 2;
            if (isBadVersion(mid)) r = mid;
            else l = mid;
        } while (r - l != 1);
        return r;
    }

    private static boolean isBadVersion(int n) {
        return n == FIRST_BAD_VERSION;
    }
}
