class Solution {
    public int lengthOfLastWord(String s) {
  
        String[] arrOfStr = s.split(" ");
        int slen = arrOfStr.length;
        // System.out.println(arrOfStr);
        // System.out.println(arrOfStr[slen-1].length());
        return arrOfStr[slen-1].length();
    }
}