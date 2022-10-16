Problem Statement URL: https://leetcode.com/problems/happy-number/

class Solution {
    public boolean isHappy(int n) {
        int rem, totalSum = 0;
        for(int i=0; i<10; i++){
            while(n>0){
                rem = n%10;
                totalSum += rem*rem;
                n /= 10;
            }
            n = totalSum;
            totalSum = 0;
            if(n==1 || n==10 || n==100)
                return true;
        }
        return false;
    }
}
