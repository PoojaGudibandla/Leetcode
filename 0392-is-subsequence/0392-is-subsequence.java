class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()<1){
            return true;
        }
        int sLen = 0;
        for(int i=0;i<t.length();i++){
            if(s.charAt(sLen)==t.charAt(i)){
                sLen++;
            }
            if(sLen==s.length()){
                return true;
            }
        }
        return false;
    }
}
