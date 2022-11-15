//Problem Statement URL: https://leetcode.com/problems/number-of-different-subsequences-gcds/

class Solution {
    int gcd(int a,int b)
    {
        return (a==0)?b:gcd(b%a,a);
    }
    int getmax(int[] nums)
    {
        int max=nums[0];
        for(int num:nums)
            max=Math.max(max,num);
        return max;
    }
    public int countDifferentSubsequenceGCDs(int[] nums) {
        int m=getmax(nums);
        int[] f=new int[m+1];
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j*j<=nums[i];j++)
            {
                if(nums[i]%j==0)
                {
                    int f1=j;
                    int f2=nums[i]/j;
                    f[f1]=gcd(f[f1],nums[i]);
                    f[f2]=gcd(f[f2],nums[i]);
                }
            }
        }
        for(int i=1;i<=m;i++)
        {
            if(f[i]==i)
                res++;
        }
        return res;
    }
}
