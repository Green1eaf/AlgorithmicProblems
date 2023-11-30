package leetcode;

//  https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeekIndexInAMountainArray {
    public static void main(String[] args) {
        System.out.println(peekIndexInMountainArray(new int[]{3, 5, 3, 2, 0}));
        System.out.println(peekIndexInMountainArray(new int[]{0, 2, 1, 0}));
        System.out.println(peekIndexInMountainArray(new int[]{0, 10, 5, 2}));
    }

    public static int peekIndexInMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int index = l + (r - l) / 2;
            if (arr[index - 1] < arr[index] && arr[index] > arr[index + 1]) return index;
            if (arr[index] > arr[index - 1]) l = index + 1;
            else r = index;
        }
        return -1;
    }
}
