class Solution {
    public int dfs(int m,int n,int i,int j,int[][] dp){
        if(i==m && j==n)
            return 1;
        
        if(i>m || j>n)
            return 0;
        
        if(dp[i][j]>0)
            return dp[i][j];
       
        return dp[i][j] = (dfs(m,n,i+1,j,dp) + dfs(m,n,i,j+1,dp));
    }
    
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        return dfs(m,n,1,1,dp);
    }
}