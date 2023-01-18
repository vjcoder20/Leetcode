class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        
       int totalsum = 0;
        
      int maxsum = arr[0];
      int minsum = arr[0];
      int currmaxsum = 0;
      int currminsum = 0;
        
        for(int el:arr){
            
            //max subarray sum(kadane waala)
            currmaxsum = Math.max(currmaxsum+el,el);
            maxsum = Math.max(maxsum,currmaxsum);
            
            //min subarraysum(reverse kadane)
            currminsum = Math.min(el,currminsum+el);
            minsum = Math.min(minsum,currminsum);
            
            totalsum+=el;
            
        }
        
        if(maxsum>0){
            return Math.max(maxsum,totalsum-minsum);
        }
        
        return maxsum;
        
        
    }
}