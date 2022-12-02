//Problem Statemnt URL: https://leetcode.com/problems/determine-if-two-strings-are-close/

class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        
        if(n!=m)
            return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char c : word1.toCharArray()){
            if(map1.get(c)==null)
                map1.put(c, 0);
            map1.put(c, map1.get(c)+1);
        }

        for(char c : word2.toCharArray()){
            if(map2.get(c)==null)
                map2.put(c,0);
            map2.put(c,map2.get(c)+1);
        }

        for(Map.Entry<Character, Integer> entry : map1.entrySet()){
            char c = entry.getKey();
            if(!map2.containsKey(c))
                return false;
        }

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        
        int i=0;
        for(Map.Entry<Character, Integer> entry : map1.entrySet()){
            int val = entry.getValue();
            arr1[i++] = val;
        }

        int j=0; 
        for(Map.Entry<Character, Integer> entry : map2.entrySet()){
            int val = entry.getValue();
            arr2[j++] = val;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
        
    }
}
