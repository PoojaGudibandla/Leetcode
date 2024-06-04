class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1len = word1.length();
        int word2len = word2.length();
        int maxLen= Math.max(word1len, word2len);
        String mergeWord="";
        for(int i=0;i< maxLen;i++){
            if(i<word1len){
                mergeWord+=word1.charAt(i);
            }
            if(i<word2len){
                mergeWord+=word2.charAt(i);
            }
        }
        return mergeWord;
    }
}