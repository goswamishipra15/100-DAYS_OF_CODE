//Problem Statement URL: https://leetcode.com/problems/basic-calculator/

class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int number = 0, result = 0, sign = 1;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                number = (number*10) + (c - '0');   
            }
            else if(c == '+'){
                result +=(number*sign);
                number = 0;
                sign = 1;
            }
            else if(c == '-'){
                result +=(number*sign);
                number = 0;
                sign = -1;
            }
            else if(c == '('){
                stack.push(result);
                stack.push(sign);
                number = 0;
                result = 0;
                sign = 1;
            }
            else if(c == ')'){
                result +=(number*sign);
                number = 0;
                result *= stack.peek();
                stack.pop();
                result +=stack.peek();
                stack.pop();
            }
        }
        return result +=(number*sign);
    }
}
