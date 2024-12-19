class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed_num = 0;

        while (x>0) {
            int digit = x % 10;
            reversed_num = reversed_num * 10 + digit;
            x /= 10;
        }
        return original == reversed_num;
    }
}