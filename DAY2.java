Problem Statement URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueElement = 1; //atleast one unique element
        for(int j=1;j<nums.length;j++){
            if(nums[j] == nums[j-1]){
                continue;
            }
            else{
                nums[uniqueElement] = nums[j];
                uniqueElement++;
            }
        }
        return uniqueElement;
    }
}
