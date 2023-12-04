package leetcode;

//  https://leetcode.com/problems/hamming-distance/

public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));  //2
        System.out.println(hammingDistance(3, 1));  //1
    }

    public static int hammingDistance(int x, int y) {
        int ans = 0;
        while (x != y) {
            if ((x & 1) != (y & 1)) ans++;
            x >>= 1;
            y >>= 1;
        }
        return ans;
    }
}
