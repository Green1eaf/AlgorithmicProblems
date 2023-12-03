package leetcode;

//  https://leetcode.com/problems/valid-anagram/

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
        System.out.println(isAnagram("aa", "bb"));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (var i : s.toCharArray()) {
            map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
        }
        for (var i : t.toCharArray()) {
            if (map.containsKey(i)) {
                if (map.get(i) == 1) map.remove(i);
                else map.put(i, map.get(i) - 1);
            } else return false;
        }
        return map.isEmpty();
    }
}
