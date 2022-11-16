//Problem Statement URL: https://leetcode.com/problems/next-greater-numerically-balanced-number/
class Solution {
    public int nextBeautifulNumber(int n) {
        n=n+1;
        while(true)
        {
            if(find(n)) return n;
            else
                n++;
        }
        
    }
    public boolean find(int n)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        while(n!=0)
        {
            int x=n%10;
            if(hm.containsKey(x))
                hm.put(x,hm.get(x)+1);
            else
                hm.put(x,1);
            n=n/10;
        }
        for(Map.Entry<Integer,Integer> map : hm.entrySet()) 
        {
            if(map.getKey()!=map.getValue()) return false;
        }
        return true;
}
}
