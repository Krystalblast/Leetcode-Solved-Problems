class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if(pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String>charToWord = new HashMap<>();
        HashMap<String, Character>wordToChar = new HashMap<>();

        for(int i = 0; i < words.length; i++) {
            char charP = pattern.charAt(i);
            String word = words[i];

            if(charToWord.containsKey(charP)) {
                if(!charToWord.get(charP).equals(word)) {
                    return false;
                }
            } else {
                charToWord.put(charP, word);
            }

            if(wordToChar.containsKey(word)) {
                if (wordToChar.get(word)!=charP) {
                    return false;
                }
            } else {
                wordToChar.put(word,charP);
            }
        
        }
        return true;
    }
}