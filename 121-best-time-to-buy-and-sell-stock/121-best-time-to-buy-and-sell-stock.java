class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        int maxsf = 0;
        for(int i = n-1;i>=0;i--){
            dp[i] = Math.max(maxsf,arr[i]);
            maxsf = dp[i];
        }
        
        int maxprofit = 0;
         for(int i=0;i<dp.length;i++){
             maxprofit = Math.max(maxprofit,dp[i]-arr[i]);
         }  
        
        return maxprofit;
    }
}