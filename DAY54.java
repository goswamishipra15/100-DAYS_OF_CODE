//Problem Statement URL: https://leetcode.com/problems/move-zeroes/
class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0 && index++ < i){
                nums[index-1] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
