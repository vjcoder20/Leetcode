class TimeMap {
HashMap<String,String> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
       String putt = key+"#"+timestamp;
       map.put(putt,value);
    }
    
    public String get(String key, int timestamp) {
         String str = key+"#"+timestamp;
            while(timestamp>=1 && map.containsKey(str)==false){
                str = key+"#"+(timestamp-1);
                timestamp--;
            }
             if(map.containsKey(str))
            return map.get(str);
        
           return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */