class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        int[] res = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
         PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a).compareTo(map.get(b))); 
        
      for(int key:map.keySet()){
          pq.add(key);
          if(pq.size()>k)
              pq.remove();
      }
        
        int i = 0;
        while(pq.size()>0){
           res[i++] = pq.remove();
        }
        
        return res;
    }
}