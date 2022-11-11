//Problem Statement URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueElement = nums[0];
        int count = 1;         //TO TRACK THE NUMBER OF COUNT OF SAME ELEMENT IS ATMOST TWICE
        int index = 1;
        for(int i=1;i<nums.length;i++){
            if(uniqueElement == nums[i]){
                if(count<2){
                    count++;
                    nums[index++] = nums[i];
                }
                else{
                    continue;
                }
            }
            else{
                uniqueElement = nums[i];
                nums[index++] = nums[i];
                count = 1;
            }
        }
        return index;
    }
}
