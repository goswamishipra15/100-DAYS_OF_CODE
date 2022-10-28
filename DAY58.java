//Problem Statement URL: https://leetcode.com/problems/group-anagrams/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);
            if(map.containsKey(temp)){
                map.get(temp).add(strs[i]);
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(temp,list);
            }
        }
        return new ArrayList<>( map.values()); // map.values() iterarte through each element present in map
    }
}
