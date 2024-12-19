/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    const words = s.trim();
    const lastWord = words.lastIndexOf(' ');
    return words.length - lastWord - 1;
};

/**
var lengthOfLastWord = function(s){
    const words = s.split(' ');
    
    while(words[words.length -1] === ' '){
        words.pop();
    }

    return words[words.length-1].length;
}
 */