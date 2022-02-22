class Solution(object):

    def longestPalindrome(self, s):
        i = 0
        rs = s[0]
        while i < len(s):
            l = i
            r = i
            str = ""
            while l >= 0 and r < len(s) and s[l] == s[r]:
                if l == r:
                    str += s[l]
                else:
                    str = s[l] + str + s[r]
                l -= 1
                r += 1
            if len(str) > len(rs):
                rs = str
            str = ""
            l = i
            r = i+1
            while l >= 0 and r < len(s) and s[l] == s[r]:
                str = s[l] + str + s[r]
                l -= 1
                r += 1
            if len(str) > len(rs):
                rs = str
            i += 1
        return rs


so = Solution()
print(so.longestPalindrome("ac"))
