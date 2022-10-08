//Problem Statement URL: https://leetcode.com/problems/3sum-closest/
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closet = nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<nums.length-2;i++){
            int start = i+1, end = nums.length-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum > target) end--;
                else start++;
                if(Math.abs(sum-target) < Math.abs(closet-target)) closet = sum;
            }
        }
        return closet;
    }
}
