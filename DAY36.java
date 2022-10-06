//Problem Statement URL: https://leetcode.com/problems/time-based-key-value-store/
class TimeMap {
    HashMap<String, HashMap<Integer, String>> timeMap;
    public TimeMap() {
        timeMap = new HashMap<String, HashMap<Integer, String>>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!timeMap.containsKey(key)){
            timeMap.put(key, new HashMap<Integer,String>());
        }
        timeMap.get(key).put(timestamp,value);
        
    }
    
    public String get(String key, int timestamp) {
        if(!timeMap.containsKey(key)){
            return "";
        }
        for(int time = timestamp;time >0;time--){
            if(timeMap.get(key).containsKey(time))
                return timeMap.get(key).get(time);
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
