//Problem Statement URL: https://leetcode.com/problems/add-binary/
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder  s = new StringBuilder();
        int carry = 0;
        int p1 = a.length()-1;
        int p2 = b.length()-1;
        while(p1>=0 || p2>=0){
            int num1 = p1 >= 0 ? a.charAt(p1)-'0' : 0;
            int num2 = p2 >= 0 ? b.charAt(p2)-'0' : 0;
            int xor = carry ^ (num1 ^ num2);
            s.append(xor);
            carry = (num1 & num2) | (num1 & carry) | (num2 & carry);
            p1--;
            p2--;
        }
        if(carry == 1)
            s.append(1);
        return s.reverse().toString();
    }
}
