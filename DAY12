Problem Statement URL: https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total=0;
        int size = cardPoints.length;
        int left = 0, right = size-k;
        if(k==size){
            for(int i=0;i<size;i++)
                total += cardPoints[i];
            return total;
        }
        for(int i=size-1;i>=size-k;i--)
            total += cardPoints[i];
        int res = total;
        while(right<size){
            total +=cardPoints[left]-cardPoints[right];
            res=Math.max(total,res);
            left++;
            right++;
        }
        return res;
    }
}
