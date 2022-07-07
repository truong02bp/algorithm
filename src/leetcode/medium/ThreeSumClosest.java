package leetcode.medium;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = 999999;
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int gap = nums[i] + nums[l] + nums[r] - target;
                if (Math.abs(gap) < Math.abs(min)) {
                    min = gap;
                }
                if (gap == 0)
                    return gap + target;
                if (gap > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return min + target;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2};
        System.out.println(threeSumClosest(nums, 3));
    }
}
