class Solution {
    
    public int halveArray(int[] arr) {
        int fans = 0;
        
        long sum = 0;
        for(int elem:arr)
            sum+=elem;
        
        
        
        double ans = (sum*1.0)/2;
        
       PriorityQueue<Double> pq = new PriorityQueue<>((a,b) -> b.compareTo(a)); 
 
         for(int val:arr){
        pq.add(val*1.0);
    }
        
     
        while(ans>0){
            double get = pq.remove();
           get/=2;
            ans-=get;
            pq.add(get);
             fans++;
        }
        
      return fans;
        
    }
}