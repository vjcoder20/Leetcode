class Solution {
    public int findMaxLength(int[] arr) {
        /*Hard Method to think
         HashMap<Integer,Integer> map = new HashMap<>(); //c0-c1 vs first index occuring of this pair
      
      map.put(0,-1);
      int oans = 0;
      int c0 = 0;
      int c1 = 0;
      
      for(int i=0;i<arr.length;i++){
          if(arr[i]==0){
              c0++;
          }
          else{
              c1++;
          }
          
          int state = c0-c1;
          
          if(map.containsKey(state)){
              int ans = i-map.get(state);
              oans = Math.max(oans,ans);
          }
          else{
              map.put(state,i);
          }
      }

        return oans;
        */
        
        
        //Relatively easy method to think
        //easy method
        
        //replace all 0's with -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        
        
        //Applying subarray having sum equal to zero
        
        int oval = 0;
    HashMap<Integer,Integer> map = new HashMap<>();
    
    int ps = 0;
   
    
    map.put(0,-1);
    for(int i=0;i<arr.length;i++){
        ps+=arr[i];
        
        if(map.containsKey(ps)){
            int idx = map.get(ps);
            oval = Math.max(oval,i-idx);
        }
        else{
            map.put(ps,i);
        }
    }
		return oval;
        
    }
}