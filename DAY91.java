//Problem Statement URL: https://leetcode.com/problems/unique-number-of-occurrences/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(Integer i:map.keySet()){
            if(set.contains(map.get(i))) return false;
            set.add(map.get(i));
        }
        return true;
        
    }
}
