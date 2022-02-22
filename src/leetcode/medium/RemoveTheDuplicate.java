package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveTheDuplicate {

    public static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i=0;i<nums.length;i++) {
            map.putIfAbsent(nums[i], 0);
            if (map.get(nums[i]) < 2) {
                nums[index] = nums[i];
                index++;
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
}
