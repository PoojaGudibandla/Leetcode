class Solution {
    public boolean isPalindrome(int x) {
       // write the logic here
      if(x<0)
        return false;
      else if(x==0)
        return true;
      else{
        List<Integer> list = new ArrayList<>();
        while(x>0){
          int n=x%10;
          x=x/10;
          list.add(n);
        }
        for(int i=0, j=list.size()-1;i<j;i++,j--){
          if(list.get(i)!=list.get(j))
            return false;
        }
      }
         return true; 
      
    }
}