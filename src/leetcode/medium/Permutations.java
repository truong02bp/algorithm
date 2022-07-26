package leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> check = new HashSet<>();
        List<Integer> value = new ArrayList<>();
        backTrack(nums, result, check, value);
        return result;
    }

    public static void backTrack(int[] nums, List<List<Integer>> result, Set<Integer> check, List<Integer> value) {
        if (check.size() == nums.length) {
            result.add(new ArrayList<>(value));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!check.contains(nums[i])) {
                value.add(nums[i]);
                check.add(nums[i]);
                backTrack(nums, result, check, value);
                check.remove(nums[i]);
                value.remove(Integer.valueOf(nums[i]));
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        System.out.println(permute(nums));
    }
}
