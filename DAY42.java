//Problem Statement URL: https://leetcode.com/problems/largest-perimeter-triangle/
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=len-3;i>=0;i--){
            if(nums[i]+nums[i+1]>nums[i+2])
                return nums[i]+nums[i+1]+nums[i+2];
        }
        return 0;
    }
}
