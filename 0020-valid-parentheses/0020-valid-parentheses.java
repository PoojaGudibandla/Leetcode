class Solution {
    public boolean isValid(String s) {
        // write logic here
      Stack<Character> stack = new Stack<Character>();
      int n = s.length();
      for(int i=0;i<n;i++){
        if(s.charAt(i) =='(' || s.charAt(i) =='[' || s.charAt(i) =='{'){
          stack.push(s.charAt(i));
        }
        else{ 
          if(stack.isEmpty()){
            return false;
          }
          char ch = stack.peek();
          if((ch == '(' && s.charAt(i) ==')') || (ch == '[' && s.charAt(i) ==']') || (ch == '{' && s.charAt(i) =='}')){
            stack.pop();
          }
            else{ return false;}
             }
             }
             return stack.isEmpty();
            
    }
}