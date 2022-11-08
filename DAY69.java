//Problem Statement URL: https://leetcode.com/problems/make-the-string-great/
class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && Math.abs(stack.peek() - s.charAt(i)) == 32){
                stack.pop();
            }
            else{
            stack.push(s.charAt(i));
            }
        }
            StringBuilder ans = new StringBuilder();
            for(char cur : stack){
                ans.append(cur);
            }
        return ans.toString();
    }
}
