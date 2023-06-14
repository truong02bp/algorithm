package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> results = new ArrayList<>();
        backTrack(results, new ArrayList<>(), candidates, 0, target, 0);
        return results;
    }

    public static void backTrack(List<List<Integer>> results, List<Integer> values, int[] candidates, int sum, int target, int j) {
        if (sum == target) {
            results.add(new ArrayList<>(values));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = j; i < candidates.length; i++) {
            if (i > j && candidates[i] == candidates[i - 1]) {
                continue;
            }
            sum += candidates[i];
            values.add(candidates[i]);
            backTrack(results, values, candidates, sum, target, i + 1);
            sum -= candidates[i];
            values.remove(values.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println(combinationSum(candidates, target));
    }
}
