class Solution {
    public int minimumRounds(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int elem:arr){
            map.put(elem,map.getOrDefault(elem,0)+1);
        }
        
        int ans = 0;
        
        for(int key:map.keySet()){
            int get = map.get(key);
            
            if(get==1)
                return -1;
            
           ans+=(get/3);
           get = get%3;
           ans+=(get/2);
           get = get%2;
           ans+=get;
            
        }
        
        return ans;
        
    }
}