class Solution {
    public int maximumProduct(int[] arr, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        

        long M = 1000000007;
        
        for(int elem:arr){
            pq.add((long)elem);
        }
        
        while(k-->0){
            pq.add(pq.remove()+1);
        }
        
        long mul = 1;
        while(pq.size()>0){
            mul=(mul*pq.remove())%M;
        }
        
        return (int)mul;
    }
}