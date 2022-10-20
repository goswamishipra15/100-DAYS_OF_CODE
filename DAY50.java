//Prolem Statement URL: https://leetcode.com/problems/arranging-coins/
class Solution {
    public int arrangeCoins(int n) {
        long left = 0;
        long right = n;
        while(left<=right){
            long mid = left + (right - left)/2;
            long k = mid*(mid+1)/2;
            if(k == n)
                return (int)mid;
            if(k < n){
                left = mid+1;
            }
            else
                right = mid-1;
        }
        return (int)right;
    }
}
