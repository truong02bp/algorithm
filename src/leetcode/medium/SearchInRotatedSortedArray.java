package leetcode.medium;

public class SearchInRotatedSortedArray {

    public static int left;
    public static int right;

    public static int search(int[] nums, int target) {
        left = nums[0];
        right = nums[nums.length - 1];
        return searchBinary(nums, 0, nums.length - 1, target);
    }

    public static int searchBinary(int[] nums, int l, int r, int target) {
        if (l > r) {
            return -1;
        }
        int mid = (l + r) / 2;
        if (target == nums[mid])
            return mid;
        if (nums[mid] >= left) {
            if (target < nums[mid] && target >= left) {
                return searchBinary(nums, l, mid - 1, target);
            }
        } else {
            if (target < nums[mid]) {
                return searchBinary(nums, l, mid - 1, target);
            }
            if (target > nums[mid] && target > right) {
                return searchBinary(nums, l, mid - 1, target);
            }
        }
        return searchBinary(nums, mid + 1, r, target);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{6, 7, 1, 2, 3, 4, 5};
        System.out.println(search(nums, 1));
    }
}
