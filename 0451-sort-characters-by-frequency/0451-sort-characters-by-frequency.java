class Solution {
    static class Pair{
        char ch;
        int freq;
        
        Pair(char ch,int freq){
            this.ch = ch;
            this.freq = freq;
        }
    }
    
    public String frequencySort(String s) {
        
    PriorityQueue<Pair> pq = new PriorityQueue<>((pair1, pair2) -> Integer.compare(pair2.freq, pair1.freq));
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char ch:s.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch:map.keySet()){
            int get = map.get(ch);
            pq.add(new Pair(ch,get));
        }
        
        while(pq.size()>0){
            Pair rp = pq.remove();
            while(rp.freq-->0){
                sb.append(rp.ch);
            }
        }
        
        return sb.toString();
    }
}