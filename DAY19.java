class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer,Integer> dict = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(dict.get(nums[i])==null){
                dict.put(nums[i],1);
            }
            else{
                Integer count = dict.get(nums[i]);
                dict.put(nums[i],++count);
            }  
        }
        for(Map.Entry<Integer,Integer> entry: dict.entrySet()){
            if(entry.getValue()>1)
                list.add(entry.getKey());
        }
        return list;
    }
}
