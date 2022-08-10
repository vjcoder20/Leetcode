class Solution {
    public int maxSum(int[] arr,int idx,int[] dp){
        
        if(idx==0)
            return arr[idx];
        
        if(idx<0) return 0;
        
        if(dp[idx]!=-1)
            return dp[idx];
            
            int pick = arr[idx]+maxSum(arr,idx-2,dp);
            int notpick = maxSum(arr,idx-1,dp);
        
        return dp[idx]=Math.max(pick,notpick);
        
    }
    
    public int rob(int[] arr) {
        int[] dp = new int[arr.length];
        
        dp[0] = arr[0];
        
        for(int i=1;i<arr.length;i++){
            int pick = arr[i]+(i>1?dp[i-2]:0);
            int notpick = dp[i-1];
            dp[i] = Math.max(pick,notpick);
        }
        
       return dp[arr.length-1];
    }
}