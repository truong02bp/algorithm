package leetcode.medium;

import java.util.Arrays;

public class TwoSumII {

    public static int searchBinary(int[] numbers, int l, int r, int target) {
        if (l > r) {
            return -1;
        }
        int mid = (l + r) / 2;
        if (numbers[mid] == target)
            return mid;
        if (numbers[mid] < target)
            return searchBinary(numbers,mid+1, r, target);
        return searchBinary(numbers, l, mid-1, target);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int j = 0;
        int[] result = new int[2];
        for (int i=0;i < numbers.length; i++){
            int index = searchBinary(numbers, i+1, numbers.length-1, target - numbers[i]);
            if (index != -1) {
                result[j] = i+1;
                result[j+1] = index+1;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{0,0,3,4};
        int[] numbers2 = new int[]{5,25,75};
        System.out.println(Arrays.toString(twoSum(numbers, 0)));
        System.out.println(Arrays.toString(twoSum(numbers2, 100)));
    }
}
