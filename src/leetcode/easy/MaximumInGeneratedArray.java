package leetcode.easy;

public class MaximumInGeneratedArray {

    public static int getMaximumGenerated(int n) {
        int i=0;
        int[] nums = new int[205];
        nums[0] = 0;
        nums[1] = 1;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int max = Integer.MIN_VALUE;
        while (2*i <= n) {
            nums[2*i] = nums[i];
            nums[2*i+1] = nums[i] + nums[i+1];
            if (max < nums[2*i]) {
                max = nums[2*i];
            }
            if (max < nums[2*i+1] && (2*i+1) <= n) {
                max = nums[2*i+1];
            }
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(getMaximumGenerated(7));
    }
}
