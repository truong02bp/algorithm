class Solution(object):
    def reverse(self, x):
        negative = False
        if x < 0:
            negative = True
            x = 0 - x
        rs = 0
        while x > 0:
            rs = rs * 10 + x % 10
            x //= 10
            if rs > 2147483647:
                return 0
        if negative:
            rs = 0 - rs
        return rs


so = Solution()
print(so.reverse(-123))
