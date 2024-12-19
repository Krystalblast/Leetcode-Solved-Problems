class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        magazine_letters = Counter(magazine)

        for char in ransomNote:
            if magazine_letters[char] == 0:
                return False
            magazine_letters[char] -=1
        return True