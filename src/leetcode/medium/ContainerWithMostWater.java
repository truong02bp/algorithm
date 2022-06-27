package leetcode.medium;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int max = -1;
        int l = 0;
        int r = height.length-1;
        while (l < r) {
            if (height[l] < height[r]) {
                max = Math.max(max, height[l] * (r-l));
                l++;
            }
            else {
                max = Math.max(max, height[r] * (r-l));
                r--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
