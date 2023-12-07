public class test1 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 2, 2, 2, 3, 4, 4, 5, 6}, 2);
        for(var i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] arr, int target) {
        int[] ans = {-1, -1};
        int first = -1;
        int last = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) first++;
            else ans[0] = first + 1;
            if (arr[arr.length - 1 - i] != target) last--;
            else ans[1] = last - 1;
            if (ans[0] != -1 && ans[1] != -1) break;
        }

        return ans;
    }
}
