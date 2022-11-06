//Problem Statement URL: https://leetcode.com/problems/orderly-queue/
class Solution {
    public String orderlyQueue(String s, int k) {
        if(k > 1){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
        String temp = s;
        String res = s;
        for(int i = 0; i < s.length(); i++){
            temp = temp.substring(1) + temp.substring(0,1);
            if(temp.compareTo(res) < 0){
                res = temp;
            }
        }
        return res;
        
    }
}
