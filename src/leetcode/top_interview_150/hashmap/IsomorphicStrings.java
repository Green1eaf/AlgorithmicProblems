package leetcode.top_interview_150.hashmap;

//  https://leetcode.com/problems/isomorphic-strings/description

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add")); //true
        System.out.println(isIsomorphic("foo", "bar")); //false
        System.out.println(isIsomorphic("paper", "title")); //true
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (map1[s.charAt(i)] != map2[t.charAt(i)]) return false;
            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
