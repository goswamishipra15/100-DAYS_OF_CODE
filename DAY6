Problem Statement URL: https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/

import java.util.ArrayList;
class Solution {
    public List<Integer> findLonely(int[] nums) {
    int size = nums.length;
    Arrays.sort(nums);
    ArrayList<Integer> result = new ArrayList<>();
    if(size == 1){
       result.add(nums[0]);
    }
    if(size > 1){
        if(nums[0]+1 < nums[1])
           result.add(nums[0]);
        if(nums[size-1]-1 > nums[size-2])
           result.add(nums[size-1]);
    }
    for(int i=1;i<size-1;i++){
        if(nums[i]+1 < nums[i+1] && nums[i-1] < nums[i]-1)
            result.add(nums[i]);
    }
      return result;  
    }
}
