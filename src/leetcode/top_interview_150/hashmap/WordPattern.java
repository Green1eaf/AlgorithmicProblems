package leetcode.top_interview_150.hashmap;

//  https://leetcode.com/problems/word-pattern

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog")); //true
        System.out.println(wordPattern("abba", "dog cat cat fish"));    //false
        System.out.println(wordPattern("aaaa", "dog cat cat dog")); //false
    }

    public static boolean wordPattern(String pattern, String s) {
        var arr = s.split(" ");
        if (pattern.length() != arr.length) return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.isEmpty() || (!map.containsKey(pattern.charAt(i)) && !map.containsValue(arr[i]))) {
                map.put(pattern.charAt(i), arr[i]);
            }
            if (map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(arr[i])) return false;
            if (!map.containsKey(pattern.charAt(i)) && map.containsValue(arr[i])) return false;
        }
        return true;
    }
}
