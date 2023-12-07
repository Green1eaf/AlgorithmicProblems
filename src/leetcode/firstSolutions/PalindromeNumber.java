package leetcode.firstSolutions;

import org.junit.jupiter.api.Assertions;

import java.util.List;

// https://leetcode.com/problems/palindrome-number/

public class PalindromeNumber {
    public static void main(String[] args) {
        Assertions.assertArrayEquals(List.of(false, true, false).toArray(),
                List.of(isPalindrome(-121), isPalindrome(121), isPalindrome(10)).toArray());
        System.out.println("Задача решена успешно!");
    }

    private static boolean isPalindrome(Integer x) {
        if (x < 0) return false;
        int reversed = 0;
        int temp = x;
        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        return x == reversed;
    }
}
