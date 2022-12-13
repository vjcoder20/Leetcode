class Solution {
    
    public int minFallingPathSum(int[][] arr) {
     
        int n = arr.length;
         Integer[][] dp = new Integer[n][n];
        int min = Integer.MAX_VALUE;
        
        for(int j=0;j<n;j++)
            dp[0][j] = arr[0][j];
        
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
        int up =  dp[i-1][j];
        int diag1 = j>=1?dp[i-1][j-1]:Integer.MAX_VALUE;
        int diag2 = j<n-1?dp[i-1][j+1]:Integer.MAX_VALUE;
        dp[i][j] = arr[i][j] + Math.min(up,Math.min(diag1,diag2));
            }
        }
        
        
        
       for(int j=0;j<n;j++){
           min = Math.min(min,dp[n-1][j]);
       }
        return min;
    }
}