class Solution {
    public int solve(int[] arr,int idx,int buy,Integer[][] dp,int fee){
        
        if(idx==arr.length)
            return 0;
        
        if(dp[idx][buy]!=null)
            return dp[idx][buy];
        
        int profit = 0;
        
        if(buy==1){
            int profit1 = -arr[idx]+solve(arr,idx+1,0,dp,fee); //take
            int profit2 = 0 + solve(arr,idx+1,1,dp,fee);  //not take
            profit = Math.max(profit1,profit2);
        }
        else{  //means sell
            int profit1 = arr[idx]+solve(arr,idx+1,1,dp,fee)-fee; //take
            int profit2 = 0 + solve(arr,idx+1,0,dp,fee);  //not take
            profit = Math.max(profit1,profit2);
        }
            
        
        return dp[idx][buy]=profit;
    }
    
    public int maxProfit(int[] arr,int fee) {
        Integer[][] dp = new Integer[arr.length][2];
        return solve(arr,0,1,dp,fee);  //here one signify buy and 0 is to not buy
    }
}