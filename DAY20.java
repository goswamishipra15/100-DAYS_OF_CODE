//Problem Statement URL: https://leetcode.com/problems/find-the-duplicate-number/
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow==fast)
                break;
        }
        int duplicate = 0;
        while(true){
            slow = nums[slow];
            duplicate = nums[duplicate];
            if(slow == duplicate)
                return duplicate;
        }
        
    }
}
