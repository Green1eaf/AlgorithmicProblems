package leetcode.top_interview_150.hashmap;

//  https://leetcode.com/problems/happy-number

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));    //true
        System.out.println(isHappy(2));     //false
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (true) {
            int sum = 0;
            while (n != 0) {
                int temp = n % 10;
                sum += temp * temp;
                n /= 10;
            }
            if (sum == 1) return true;
            if (set.contains(sum)) return false;
            set.add(sum);
            n = sum;
        }
    }
}
