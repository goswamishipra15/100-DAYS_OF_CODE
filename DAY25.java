//Problem Statement URL: https://leetcode.com/problems/minimum-bit-flips-to-convert-number/
class Solution {
    public int minBitFlips(int start, int goal) {
        int xorNumber = start ^ goal; // find the bits which are different in both numbers
        int count = 0;
        //this loop finds the set bit in xorNumber
        while(xorNumber!=0){
            xorNumber = xorNumber & (xorNumber - 1);
            count++;
        }
        return count;
    }
}
