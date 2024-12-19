class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        return haystack.find(needle)


"""
class Solution(object):
    def strStr(self, haystack, needle):
        if not needle:
            return 0;
        
        haystack_length = len(haystack)
        needle_length = len(needle)

        for i in range(haystack_length - needle_length + 1):
            j = 0
            while j < needle_length and haystack[i+j] === needle[j]:
                j+=1
            if j == needle_length:
                return i
        
        return -1
"""