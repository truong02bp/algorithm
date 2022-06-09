from typing import List


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        nums.sort()
        """
        Do not return anything, modify nums in-place instead.
        """


so = Solution()

nums = [0, 2, 1, 2, 1, 0]

so.sortColors(nums)

print(nums)