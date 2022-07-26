package leetcode.medium;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {


    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int firstPosition = searchBinary(nums, 0, nums.length - 1, target, true);
        int lastPosition = searchBinary(nums, 0, nums.length - 1, target, false);
        return new int[]{firstPosition, lastPosition};
    }

    public static int searchBinary(int[] nums, int l, int r, int target, boolean first) {
        if (l > r) {
            return -1;
        }
        int mid = (l + r) / 2;
        if (nums[mid] == target) {
            int index;
            if (first) {
                index = searchBinary(nums, l, mid - 1, target, true);
            } else {
                index = searchBinary(nums, mid + 1, r, target, false);
            }
            if (index != -1) {
                return index;
            }
            return mid;
        } else {
            if (nums[mid] < target) {
                return searchBinary(nums, mid + 1, r, target, first);
            }
            return searchBinary(nums, l, mid - 1, target, first);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int[] nums2 = new int[]{5, 7, 7, 8, 8, 10};
        int[] nums3 = new int[]{1, 1, 1, 1, 1, 1, 2, 3, 4, 4, 5, 5, 5, 6, 7, 8, 8, 8, 8};
        int target = 8;
        int target2 = 6;
        int target3 = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
        System.out.println(Arrays.toString(searchRange(nums2, target2)));
        System.out.println(Arrays.toString(searchRange(nums3, target3)));
    }

}
