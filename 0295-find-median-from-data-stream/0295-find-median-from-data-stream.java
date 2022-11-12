class MedianFinder {
    PriorityQueue<Integer> small;
     PriorityQueue<Integer> greater;
    int count;
    
    public MedianFinder() {
        small = new PriorityQueue<>((a,b) -> b.compareTo(a));
         greater = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
       
        if(greater.size()>0 && greater.peek()<num)
            greater.add(num);
        else
        small.add(num);
        
       if(small.size()-greater.size()==2)
           greater.add(small.remove());
        else if(greater.size()-small.size()==2)
            small.add(greater.remove());
            
        
    }
    
    public double findMedian() {
        
        if(small.size()==greater.size())
            return ((small.peek()+greater.peek())/2.0);
        
        else if(small.size()>greater.size())
            return small.peek();
        
        return greater.peek();
       
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */