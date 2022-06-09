from typing import List


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n = len(matrix)-1
        for x in range(0, n):
            if target == matrix[x + 1][0]:
                return True
            if target < matrix[x+1][0]:
                return self.searchBinary(matrix[x], 0, len(matrix[x])-1, target)
        return self.searchBinary(matrix[n], 0, len(matrix[n])-1, target)

    def searchBinary(self, a: List[int], left: int, right: int, x: int) -> True:
        if left > right:
            return False
        mid = (left + right) // 2

        if a[mid] == x:
            return True
        if x > a[mid]:
            return self.searchBinary(a, mid + 1, right, x)
        return self.searchBinary(a, left, mid - 1, x)