class Solution {
    public boolean isPossible(int[] arr) {
       HashMap<Integer,Integer> map = new HashMap<>();
       HashMap<Integer,Integer> map2 = new HashMap<>();
        
        for(int elem:arr){
            map.put(elem,map.getOrDefault(elem,0)+1);
        }
        
        for(int elem:arr){
            if(map.get(elem)==0) continue;
            
            if(map2.getOrDefault(elem-1,0)>0){
                map2.put(elem-1,map2.getOrDefault(elem-1,0)-1);
                 map2.put(elem,map2.getOrDefault(elem,0)+1);
            }
            
            else if(map.getOrDefault(elem+1,0)>0 && map.getOrDefault(elem+2,0)>0){
                map.put(elem+1,map.get(elem+1)-1);
                 map.put(elem+2,map.get(elem+2)-1);
                 map2.put(elem+2,map2.getOrDefault(elem+2,0)+1);
            }
            
            
            else
            return false;
            
            
            map.put(elem,map.get(elem)-1);
            
        }
        
        return true;
      
        
    }
}