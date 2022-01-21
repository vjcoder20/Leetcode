class Solution {
    public int minPathSum(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] dp  = new int[m][n];
        return fun(arr,m-1,n-1,dp);
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