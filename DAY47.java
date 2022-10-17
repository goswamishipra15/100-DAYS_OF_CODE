//Problem Statement URL: https://leetcode.com/problems/check-if-the-sentence-is-pangram/
class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for(char chars:sentence.toCharArray()){
            if(!set.contains(chars))
                set.add(chars);
        }
        return set.size() == 26;
    }
}
