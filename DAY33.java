//Problem Statement URL: https://leetcode.com/problems/minimum-time-to-make-rope-colorful/
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int removalTime = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<neededTime.length;i++){
            while(!stack.isEmpty() && stack.peek().equals(colors.charAt(i))){
                stack.pop();
                if(neededTime[i-1]>neededTime[i]){
                    removalTime += neededTime[i];
                    neededTime[i] = neededTime[i-1];
                }
                else{
                    removalTime += neededTime[i-1];
                }
            }
            stack.push(colors.charAt(i));
        }
        return removalTime;
    }
}
