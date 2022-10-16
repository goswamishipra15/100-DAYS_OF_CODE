//Problem Statement URL: https://leetcode.com/problems/sqrtx/
class Solution {
    public int mySqrt(int x) {
        if(x == 0) return x;
        int l = 1, r = x;
        int result = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(mid <= x/mid){
                result = mid;
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return result;
    }
}
