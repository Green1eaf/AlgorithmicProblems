package leetcode.top_interview_150.two_pointers;

//  https://leetcode.com/problems/container-with-most-water

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));  //49
        System.out.println(maxArea(new int[]{1, 1}));   //1
    }

    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;
        while (start < end) {
            int area = Math.min(height[start], height[end]) * (end - start);
            if (area > maxArea) maxArea = area;
            else if (height[start] > height[end]) end--;
            else start++;
        }
        return maxArea;
    }
}
