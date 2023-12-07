package leetcode.firstSolutions;

//  https://leetcode.com/problems/guess-number-higher-or-lower/

public class GuessNumberHigherOrLower {
    private static int GUESS_NUMBER = 0;

    public static void main(String[] args) {
        GUESS_NUMBER = 6;
        System.out.println(guessNumber(10));
        GUESS_NUMBER = 1;
        System.out.println(guessNumber(1));
        GUESS_NUMBER = 1;
        System.out.println(guessNumber(2));
    }

    public static int guessNumber(int n) {
        int l = 0;
        int r = n;
        do {
            int mid = l + (r - l) / 2;
            if (guess(mid) == 0) return mid;
            if (guess(mid) == -1) r = mid - 1;
            else l = mid + 1;
        } while (l <= r);
        return -1;
    }

    private static int guess(int i) {
        return Integer.compare(GUESS_NUMBER, i);
    }
}
