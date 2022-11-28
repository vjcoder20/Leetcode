class Solution {
    public List<List<Integer>> findWinners(int[][] arr) {
        List<List<Integer>> li = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        
      
        
        
        ArrayList<Integer> wi = new ArrayList<>();
         ArrayList<Integer> lo = new ArrayList<>();
        
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i][0],map.getOrDefault(arr[i][0],0)+1);
            map2.put(arr[i][1],map2.getOrDefault(arr[i][1],0)+1);
        }
        
        
        for(int key:map.keySet()){
            if(map2.containsKey(key)==false)
              wi.add(key);
        }
        
        Collections.sort(wi);
        li.add(wi);
        
        
        for(int key:map2.keySet()){
            if(map2.get(key)==1)
               lo.add(key);
        }
        
         Collections.sort(lo);
        li.add(lo);
        
        
        
        return li;
    }
}