class Solution {
    public List<Integer> majorityElement(int[] arr) {
        
          int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int elem:arr){
            map.put(elem,map.getOrDefault(elem,0)+1);
        }
        
       List<Integer> ans = new ArrayList<>();
        
        for(int key:map.keySet()){
            int get = map.get(key);
            if(get>n/3)
               ans.add(key);
            
        }
        
        return ans;
    }
}