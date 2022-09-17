//Problem Statement URL: class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        if(s.compareTo(t) == 0) return true;
        HashMap<Character,Integer> h1 = new HashMap<>();
        HashMap<Character,Integer> h2 = new HashMap<>();
        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();
        for(int i=0;i<c1.length;i++){
            if(h1.get(c1[i]) == null){
                h1.put(c1[i],1);
            }
            else{
                Integer c = (int)h1.get(c1[i]);
                h1.put(c1[i],++c);
                
            }
            
        }
        for(int j=0;j<c2.length;j++){
            if(h2.get(c2[j]) == null){
                h2.put(c2[j],1);
            }
            else{
                Integer d = (int)h2.get(c2[j]);
                h2.put(c2[j],++d);
            }
        }
        return h1.equals(h2);
    }
}https://leetcode.com/problems/valid-anagram/

