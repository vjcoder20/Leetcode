class Solution {
    public int minStoneSum(int[] piles, int k) {
        
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
    for(int elem:piles)
        pq.add(elem);
        
    while(k-->0){
        int num = pq.peek();
        pq.remove();
        pq.add(num-(int)Math.floor(num/2.0));
    }
        
       int sum = 0;
        
        while(pq.size()>0){
            sum+=pq.peek();
            pq.remove();
        }
        
        return sum;
        
    }
}