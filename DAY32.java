//Problem Statement URL: https://leetcode.com/problems/valid-palindrome/
class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 1) return true;
        int start = 0, end = s.length()-1;
        while(start<=end){
            char head = s.charAt(start);
            char tail = s.charAt(end);
            if(!Character.isLetterOrDigit(head)){
                start++;
            }
            else if(!Character.isLetterOrDigit(tail)){
                end--;
            }
            else if(Character.toLowerCase(head) != Character.toLowerCase(tail)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}
