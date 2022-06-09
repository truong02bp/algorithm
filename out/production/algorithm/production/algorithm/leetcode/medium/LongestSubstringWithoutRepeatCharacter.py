
class Solution(object):
    @staticmethod
    def lengthOfLongestSubstring(s):
        i = 0
        result = 0
        while i < len(s):
            index = i
            c = s[index]
            mapping = set()
            counter = 0
            while c not in mapping:
                index += 1
                counter += 1
                mapping.add(c)
                if index == len(s):
                    break
                c = s[index]
            if counter > result:
                result = counter
            i += 1
        return result

s = "abcabcbb"
print(Solution.lengthOfLongestSubstring(s))
