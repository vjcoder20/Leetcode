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
        Arrays.fill(dp,-1);
        return maxSum(arr,arr.length-1,dp);
    }
}