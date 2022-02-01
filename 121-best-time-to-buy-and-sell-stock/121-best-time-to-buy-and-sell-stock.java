class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        int minsf = arr[0];
        for(int i = 1;i<n;i++){
            dp[i] = Math.min(minsf,arr[i]);
            minsf = dp[i];
        }
        
        int maxprofit = 0;
         for(int i=0;i<dp.length;i++){
             maxprofit = Math.max(maxprofit,arr[i]-dp[i]);
         }  
        
        return maxprofit;
    }
}