//Problem Statement URL: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

import java.util.*;
class Solution {
    public String removeDuplicates(String s) {
        if(s.length()==1) return s;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++){
            if(stack.isEmpty() || stack.peek() != s.charAt(i)){
            stack.push(s.charAt(i));
            }
            else{
                stack.pop();
            }
        }
        String newString = "";
        while(!stack.isEmpty()){
            newString=stack.peek() + newString;
            stack.pop();
        }
        return newString;
    }
}
