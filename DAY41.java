//Problem Statement URL:https://leetcode.com/problems/increasing-triplet-subsequence/
class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length <= 2) return false;
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for(int num:nums){
            if(num <= max1) max1 = num;     //stores first smallest number
            else if(num <= max2) max2 = num;  //stores second number which is greater than first 
            else return true;    //if no numbers are not smaller than first and second then definitely it is greater than both
        }
        return false;
    }
}
