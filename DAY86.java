//Problem Statement URL: https://leetcode.com/problems/sum-of-subarray-minimums/

class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        long sum = 0;
        long count;
        int left, mid;
        int mod = 1000000007;
        for(int i = 0; i <= arr.length; i++){
            while(!stack.isEmpty() && (i == arr.length || arr[stack.peek()] >= arr[i])){
                mid = stack.pop();
                left = stack.isEmpty() ? -1 : stack.peek();
                count = (mid - left) * (i - mid) % mod;
                sum += count * arr[mid] % mod;
                sum %= mod;
            }
            stack.push(i);
        }
        return (int)sum;
        
    }
}
