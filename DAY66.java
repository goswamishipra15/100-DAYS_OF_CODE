//Problem Statement URL: https://leetcode.com/problems/word-pattern/
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length() != words.length)    return false;
        for(int i=0;i<words.length;i++){
            char c = pattern.charAt(i);
            if(!map.containsKey(c)){
                if(map.containsValue(words[i])) 
                    return false;
                map.put(c,words[i]);
            }
            else
                if(!map.get(c).equals(words[i])) return false;
        }
        return true;
    }
}
