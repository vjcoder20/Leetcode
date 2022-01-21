class Solution {
    public int minPathSum(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] dp  = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[i][j] = arr[i][j];
                }else{
                    dp[i][j] = arr[i][j] + Math.min((i>0?dp[i-1][j]:Integer.MAX_VALUE),(j>0?dp[i][j-1]:Integer.MAX_VALUE));
                }
            }
        }
        return dp[m-1][n-1];
    }
    
    public int fun(int[][] arr,int i,int j,int[][] dp){
        if(i==0 && j==0){
            return arr[i][j];
        }
        if(i<0 || j<0){
            return Integer.MAX_VALUE;
        }
        
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int up = fun(arr,i-1,j,dp);
        int left = fun(arr,i,j-1,dp);
        
        return dp[i][j]=Math.min(up,left)+arr[i][j];
    }
}