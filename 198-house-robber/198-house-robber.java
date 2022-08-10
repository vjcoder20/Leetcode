class Solution {
  
    public int rob(int[] arr) {
       
        int prev = arr[0];
        int prev2 = 0;
        
        for(int i=1;i<arr.length;i++){
            int pick = arr[i]+(i>1?prev2:0);
            int notpick = prev;
            int curr = Math.max(pick,notpick);
            
            prev2 = prev;
            prev = curr;
        }
        
       return prev;
    }
}