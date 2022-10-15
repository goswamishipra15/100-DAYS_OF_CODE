//Problem Statement URL: https://leetcode.com/problems/string-compression/
class Solution {
    public int compress(char[] chars) {
        String result = ""+chars[0];
        int count = 1;
        for(int i=1;i<chars.length;i++){
            char prev = chars[i-1];
            char cur = chars[i];
            if(cur == prev){
                count++;
            }
            else{
                if(count>1){
                    result+=count;
                    count = 1;
                }
                result+=cur;
            }
        }
        if(count>1){
            result+=count;
        }
        for(int i=0;i<result.length();i++){
            chars[i] = result.charAt(i);
        }
        System.out.println(result);
        return result.length();
    }
}
