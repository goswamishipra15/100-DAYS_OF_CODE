//Problem statement URL: https://leetcode.com/problems/daily-temperatures/
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int result[] = new int[temperatures.length];
        List<List<Integer>> stack = new ArrayList<>();
        for(int i=0;i<temperatures.length;i++){
            List<Integer> sublist = new ArrayList<>();
            while(stack.size()!=0 && temperatures[i] > stack.get(stack.size()-1).get(0)){
                int stackTemp = stack.get(stack.size()-1).get(0);
                int stackIndx = stack.get(stack.size()-1).get(1);
                stack.remove(stack.size()-1);
                result[stackIndx] = i - stackIndx;
            }
            sublist.add(temperatures[i]);
            sublist.add(i);
            stack.add(sublist);
        }
        return result;
    }
}
