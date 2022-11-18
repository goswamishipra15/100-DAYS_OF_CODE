//Problem Statement URL: https://leetcode.com/problems/find-the-middle-index-in-array/

class Solution {
    public int findMiddleIndex(int[] nums) {   
        int indx = 0;
        while(indx<nums.length){
            int left = 0;
            int right = 0;
            for(int  i=0;i<indx;i++){
                left += nums[i];
            }
            for(int j=indx+1;j<nums.length;j++){
                right += nums[j];
            }
            if(left == right) return indx;
            indx++;
        }
        return -1;
    }
}
