/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let left = 0, right = s.length - 1;

    var isAlphanumeric = function(c) {
        return /[a-zA-Z0-9]/.test(c);
    }
    while (left < right) {
        while(left < right && !isAlphanumeric(s[left])) left++;
        while(left < right && !isAlphanumeric(s[right])) right--;

        if(s[left].toLowerCase() !== s[right].toLowerCase()) {
            return false;
        }
        left++;
        right--;
    }
    return true;
};