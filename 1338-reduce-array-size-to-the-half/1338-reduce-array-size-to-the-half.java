class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int elem:arr){
           map.put(elem, map.getOrDefault(elem,0)+1);
        }
        
      PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b.compareTo(a)); 
        
    for(int elem:map.keySet()){
        int get = map.get(elem);
        pq.add(get);
    }
        
       
        
        
        int ans = 0;
        int count = 0;
        
        while(count<n/2){
            count+=pq.remove();
            ans++;
        }
        
       
        
     
        return ans;
}
}