Problem Statement URL:https://leetcode.com/problems/maximum-difference-between-increasing-elements/

class Solution {
    public int maximumDifference(int[] nums) {
        int result = 0, minNum = nums[0];
        for(int num: nums){
            minNum = Math.min(num, minNum);
            result = Math.max(result, num - minNum);
        }
        if(result==0)
            return -1;
        else
            return result;
        
    }
}
