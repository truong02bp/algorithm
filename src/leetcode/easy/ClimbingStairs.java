package leetcode.easy;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        int[] nums = new int[50];
        nums[1] = 1;
        nums[2] = 2;
        int i=3;
        while (i <= n) {
            nums[i] = nums[i-1] + nums[i-2];
            i++;
        }
        return nums[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
