//Problem Statement URL: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class Solution {
    public int[] searchRange(int[] nums, int target) {
      int low,high,mid,v1 = -1, v2 = -1;
        low = 0;
        high = nums.length-1;
        
        while(low<=high)
        {
            mid = (low+high)/2;
            if(nums[mid] == target){
                v1 = mid;
                high = mid-1;
            }
            else if(nums[mid]<target)
                low = mid+1;
            else 
                high = mid-1;
        }
        
        low = 0;
        high = nums.length-1;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(nums[mid] == target)
            {
                v2 = mid;
                low = mid+1;
            }
            else if(nums[mid]<target)
                low = mid+1;
            else
                high = mid-1;
        }
        
        return new int[]{v1,v2};  
    }
}
