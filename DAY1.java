//Problem Statement URL: https://leetcode.com/problems/median-of-two-sorted-arrays/
//Solution
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Size = nums1.length;
        int nums2Size = nums2.length;
        int nums3[] = new int[nums1Size+nums2Size];
        int i = 0, j = 0, k = 0;
        while(i<nums1Size && j<nums2Size){
            if(nums1[i]<nums2[j]){
                nums3[k] = nums1[i];
                i++;
            }
            else{
                nums3[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1Size){
            nums3[k] = nums1[i];
            i++;
            k++;
        }
        while(j<nums2Size){
            nums3[k] = nums2[j];
            j++;
            k++;
        }
        int mid = nums3.length/2;
        if(nums3.length % 2 == 0){
            double median = (nums3[mid-1] + nums3[mid])/2.000;
            return median;
        }
        else{
            double median = nums3[mid];
            return median;
        }
    }
}
