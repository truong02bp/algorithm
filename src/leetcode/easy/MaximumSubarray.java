package leetcode.easy;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int counter=0;
        for (int i=0;i<nums.length;i++) {
            counter+=nums[i];
            if (counter > max) {
                max = counter;
            }
            if (counter < 0)
                counter=0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
