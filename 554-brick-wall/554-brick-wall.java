class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(List<Integer> list:wall){
            int ps = 0;
            
            for(int i=0;i<list.size()-1;i++){
                ps+=list.get(i);
                
                map.put(ps,map.getOrDefault(ps,0)+1);
            }
        }
        
        int maxgap = 0;
        
        for(int key:map.keySet()){
            int val = map.get(key);
            maxgap = Math.max(maxgap,val);
        }
        
        int minbrick = wall.size()-maxgap;        
        return minbrick;
    }
}