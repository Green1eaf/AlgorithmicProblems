package leetcode.firstSolutions;

public class BackspaceStringCompareV2TwoPointers {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));   //true
        System.out.println(backspaceCompare("ab##", "c#d#"));   //true
        System.out.println(backspaceCompare("a#c", "b"));       //false
    }

    public static boolean backspaceCompare(String s, String t) {
        var arrS = s.toCharArray();
        var arrT = t.toCharArray();
        int sp = helper(arrS);
        int tp = helper(arrT);
        if (sp != tp) return false;
        for (int i = 0; i < sp; i++) {
            if (arrS[i] != arrT[i]) return false;
        }
        return true;
    }

    private static int helper(char[] arr) {
        int k = 0;
        for (var c : arr) {
            if (c != '#') {
                arr[k++] = c;
            } else if (k > 0) {
                k--;
            }
        }
        return k;
    }
}
