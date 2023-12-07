package leetcode.firstSolutions;

//  https://leetcode.com/problems/n-th-tribonacci-number/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class NThTribonacciNumber {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));
        System.out.println(tribonacci(25));
    }

    public static int tribonacci(int n) {
        if (n == 2) return n - 1;
        if (n < 2) return n;
        Deque<Integer> deque = new ArrayDeque<>(List.of(0, 1));
        int last = 1;

        for (int i = 3; i < n; i++) {
            int temp = last;
            last += deque.pop() + deque.getLast();
            deque.addLast(temp);
        }
        return deque.getFirst() + deque.getLast() + last;
    }
}
