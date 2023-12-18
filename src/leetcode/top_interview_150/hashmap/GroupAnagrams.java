package leetcode.top_interview_150.hashmap;

//  https://leetcode.com/problems/group-anagrams

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        var res = groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(res);
        res = groupAnagrams(new String[]{""});
        System.out.println(res);
        res = groupAnagrams(new String[]{"a"});
        System.out.println(res);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (var word : strs) {
            var chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
