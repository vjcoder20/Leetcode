class KthLargest {
    
    public PriorityQueue<Integer> pq;
   public int k;
    
    public KthLargest(int k, int[] arr) {
        this.k = k;
        pq = new PriorityQueue<>();
        for(int elem:arr)
            add(elem);
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>k)
            pq.remove();
        
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */