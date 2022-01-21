class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[i][j] = 1;
                }
                else
             dp[i][j] = (i>=1?dp[i-1][j]:0)+(j>=1?dp[i][j-1]:0);
            }
        }
        return dp[m-1][n-1];
        
    }
    /*
    public int getPath(int sr,int sc,int dr,int dc,int[][] dp){
        if(sr==dr&&sc==dc){
            return 1;
        }
        if(sr>dr || sc>dc){
            return 0;
        }
        
        if(dp[sr][sc]!=0){
            return dp[sr][sc];
        }
        
        
        int rowa = getPath(sr,sc+1,dr,dc,dp);
        int cola = getPath(sr+1,sc,dr,dc,dp);
        
        dp[sr][sc] = rowa+cola;
        return (rowa+cola);
    }
    */
}