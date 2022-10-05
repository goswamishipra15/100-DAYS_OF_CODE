//Problem Statement URL: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
class Solution {
    public static String key[] = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void combo(String str, int indx, String prefix,List<String> list){
        if(indx >= str.length()){
            list.add(prefix);
            return;
        }
        char curChar = str.charAt(indx);
        String mapping = key[curChar - '1'];
        for(int i=0;i<mapping.length();i++){
            combo(str,indx+1,prefix+mapping.charAt(i),list);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.length()==0){
            return list;
        }
        combo(digits,0,"",list);
        return list;
    }
}
