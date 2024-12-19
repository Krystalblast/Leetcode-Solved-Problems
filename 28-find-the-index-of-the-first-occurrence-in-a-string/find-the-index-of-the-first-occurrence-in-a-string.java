class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) {
            return 0;
        }
        return haystack.indexOf(needle);
    }
}
/**
class Solution{
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for(int i=0; i <=hayStackLength - needleLength; i++){
            int j;
            for(j=0; j < needleLength; j++) {
                if(hayStack.charAt(i+j) !=needle.charAt(j)){
                    break;
                }
            }
            if(j == needleLength){
                return i;
            }
        }
        return -1;
    }
}
 */