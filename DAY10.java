Problem Statement URL: https://leetcode.com/problems/find-three-consecutive-integers-that-sum-to-a-given-number/

class Solution {
    public long[] sumOfThree(long num) {
        long arr[] = new long[3];
        long arr1[] = new long[0];
        long requiredNumber = num/3;
        if((requiredNumber-1)+(requiredNumber)+(requiredNumber+1) == num){
            arr[0] = requiredNumber-1;
            arr[1] = requiredNumber;
            arr[2] = requiredNumber+1;
            return arr;
        }
        else{
            return arr1;
        }

    }
}
