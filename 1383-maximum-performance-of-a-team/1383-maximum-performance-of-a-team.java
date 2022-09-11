class Solution {
    
    static class Engineer{
        
        int speed;
        int efficiency;
        
        Engineer(int speed,int efficiency){
            this.speed = speed;
            this.efficiency = efficiency;
        }
        
    }
    
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
         long mod = 1000000007;
        
        Engineer[] arr = new Engineer[n];
        
        for(int i=0;i<n;i++)
            arr[i] = new Engineer(speed[i],efficiency[i]);
        
        Arrays.sort(arr,(a,b)->Integer.compare(b.efficiency,a.efficiency));
            
PriorityQueue<Engineer> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.speed,b.speed));
        
    
        long totalsp = 0;
        long maxperf = 0;
        long currperf = 0;
        
        for(int i=0;i<n;i++){
            Engineer e = arr[i];
             pq.add(e);
            
            if(pq.size()>k)
            totalsp = totalsp-pq.remove().speed;  
                    
                totalsp = totalsp+e.speed;
                currperf = totalsp*(long)(e.efficiency);
                if(currperf>maxperf) 
                maxperf = currperf;
              
      
        }
      
            return (int)(maxperf%mod);
 
}
}