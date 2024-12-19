/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
    const words = s.split(' ');
    
    if(pattern.length !== words.length) {
        return false;
    }

    const wordToChar = new Map();
    const charToWord = new Map();

    for(let i = 0; i < pattern.length; i++){
        const a = pattern[i];
        const b = words[i];

        if(wordToChar.has(a)) {
            if(wordToChar.get(a)!=b) {
                return false;
            }
        } else {
            wordToChar.set(a,b);
        }
        if(charToWord.has(b)){
            if(charToWord.get(b)!=a){
                return false;
            }
        } else {
            charToWord.set(b,a);
        }
    }
    return true;
};