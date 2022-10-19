// Problem Statement URL: https://leetcode.com/problems/top-k-frequent-words/
class Solution {
public List topKFrequent(String[] words, int k) {
TreeMap<String,Integer> map = new TreeMap<>();            //treemap is used to sort String as lexiographical order, treemap sort map by its key
//count and update map
for(String word : words){
map.put(word,map.getOrDefault(word,0)+1);
}
ArrayList list = new ArrayList<>(map.keySet());
list.sort((a,b) -> Integer.compare(map.get(b),map.get(a))); // sort the list in reverse order based on their values as we use map.get () function to sort based on values in map
List result = list.subList(0,k); //now return the sublist
return result;
}
}
