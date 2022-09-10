class Solution {
    
    public int solve(int[] arr,int idx,int buy,int cap,Integer[][][] dp){
        
        if(idx==arr.length || cap==0)
            return 0;
        
        if(dp[idx][buy][cap]!=null)
            return dp[idx][buy][cap];
        
        int profit = 0;
        
        if(buy==1){
            int profit1 = -arr[idx]+solve(arr,idx+1,0,cap,dp); //take
            int profit2 = 0 + solve(arr,idx+1,1,cap,dp);  //not take
            profit = Math.max(profit1,profit2);
        }
        else{  //means sell
            int profit1 = arr[idx]+solve(arr,idx+1,1,cap-1,dp); //take
            int profit2 = 0 + solve(arr,idx+1,0,cap,dp);  //not take
            profit = Math.max(profit1,profit2);
        }
            
        
        return dp[idx][buy][cap]=profit;
    }
    
    public int maxProfit(int[] arr) {
       Integer[][][] dp = new Integer[arr.length][2][3];
        return solve(arr,0,1,2,dp);  //here one signify buy and 0 is to not buy
    }
}