class Solution {
    public int lastStoneWeight(int[] arr) {
      
         PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b.compareTo(a));     
    
    for(int val:arr){
        pq.add(val);
    }
    
    while(pq.size()>1){
     int n1 = pq.remove();
     int n2 = pq.remove();
        if(n1!=n2)
        pq.add(n1-n2);
    }
        if(pq.size()>0)
       return pq.peek();
        else
            return 0;
    }
}