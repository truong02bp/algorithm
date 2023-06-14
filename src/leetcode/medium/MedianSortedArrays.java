package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class MedianSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        List<Integer> numbers = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;

        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                numbers.add(nums1[i]);
                i++;
            } else {
                numbers.add(nums2[j]);
                j++;
            }
        }

        while (i < n) {
            numbers.add(nums1[i]);
            i++;
        }
        while (j < m) {
            numbers.add(nums2[j]);
            j++;
        }
        int index = (n + m) / 2;
        if ((n + m) % 2 == 0) {
            System.out.println((double) (numbers.get(index) + numbers.get(index - 1)) / 2);
        } else {
            System.out.println(numbers.get(index));
        }
    }
}
