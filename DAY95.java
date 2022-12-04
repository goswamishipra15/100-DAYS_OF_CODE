//Problem Statement URL: https://leetcode.com/problems/minimum-average-difference/

class Solution {
    public int minimumAverageDifference(int[] nums) {
        long tot=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            tot+=nums[i];
        }
        
        long sum=0;
        long temp=0;
        long min=Integer.MAX_VALUE;
        int ans=0;
        long avg=0;
        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i];
            temp=tot-sum;
            if(i==nums.length-1){
               avg=Math.abs(sum/(i+1));
            }else{
               avg=Math.abs(sum/(i+1)-temp/(n-i-1));
            }
            
            if(avg<min){
                min=avg;
                ans=i;
            }
        }
        
        return ans;
        
    }
}
