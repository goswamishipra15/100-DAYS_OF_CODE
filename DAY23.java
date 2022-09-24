//Problem Statement URL: https://leetcode.com/problems/longest-substring-without-repeating-characters/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0, right = 0, len = 0;
        int n = s.length();
        while(right<n){
            char c = s.charAt(right);
            if(map.containsKey(c)){
                left = Math.max(map.get(c)+1,left);
            }
            map.put(c,right);
            len = Math.max(len,right-left+1);
            right++;
        }
        return len;
    }
}
