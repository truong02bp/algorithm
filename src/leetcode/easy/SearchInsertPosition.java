package leetcode.easy;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        if (target <= nums[0])
            return 0;
        if (target > nums[nums.length-1])
            return nums.length;
        return searchBinary(nums, 0, nums.length-1,target);
    }

    public static int searchBinary(int[] nums, int l, int r, int x) {
        if (l > r)
            return -1;
        int mid = (l+r)/2;
        if (nums[mid] == x)
            return mid;
        if (nums[mid+1] == x)
            return mid+1;
        if (nums[mid] < x && nums[mid+1] > x)
            return mid+1;
        if (nums[mid] >= x)
            return searchBinary(nums,l,mid,x);
        else
            return searchBinary(nums,mid,r,x);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3};
        int target = 3;
        System.out.println(searchInsert(nums, target));
    }
}
