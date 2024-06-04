class Solution {
    public String reverseWords(String s) {
        String[] revWords = s.trim().split("\\s+");
        int len = revWords.length-1;
        String reverseString="";
        for(int i=len;i>=0;i--){
            if(i!=len)
             reverseString=reverseString+" "+revWords[i];
             else reverseString = revWords[i];
        }
        return reverseString;
    }
}