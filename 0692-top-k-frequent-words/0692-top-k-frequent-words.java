class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        List<String> li = new ArrayList<>();
        
        HashMap<String,Integer> map = new HashMap<>();
        
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                 (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
        );
        
        for(Map.Entry<String, Integer> entry: map.entrySet())
        {
            pq.add(entry);
            if(pq.size()>k)
                pq.remove();
        }
        
        while(!pq.isEmpty()){
            li.add(0,pq.peek().getKey());
            pq.remove();
        }
        return li;
        
    }
}