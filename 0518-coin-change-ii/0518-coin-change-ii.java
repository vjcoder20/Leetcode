class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length+1][amount+1];
        for(int[] a:dp)
            Arrays.fill(a,-1);
        return solve(amount,coins,0,dp);
    }
    
    public int solve(int amount,int[] coins,int idx,int[][] dp){
        
        if(idx>=coins.length || amount<0)
            return 0;
        
        if(amount==0){
            return 1;
        }
        
        if(dp[idx][amount]!=-1)
            return dp[idx][amount];
        
       
        int pick = solve(amount-coins[idx],coins,idx,dp);
        int not_pick = solve(amount,coins,idx+1,dp);
        
        return dp[idx][amount]=pick+not_pick;
    
     
    }
    
}