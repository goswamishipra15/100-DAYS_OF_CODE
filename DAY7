Problem Statement URL: https://leetcode.com/problems/find-triangular-sum-of-an-array/

class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int newArray[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            newArray[i] = nums[i]; 
        }
        int n = nums.length-1;
        while(n != 0){
            int i = 0;
            while(i<n){
                newArray[i] = (newArray[i] + newArray[i+1]) % 10;
                i++;
            }
            n--;
        }
        return newArray[0];
    }
}
