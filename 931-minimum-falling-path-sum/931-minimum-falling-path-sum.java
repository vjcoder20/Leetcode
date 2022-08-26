class Solution {
    public int solve(int[][] arr,int i,int j,Integer[][] dp){
        if(j<0 || j>=arr.length)
            return Integer.MAX_VALUE;
        
        
        if(i==0) return arr[i][j];
        
        if(dp[i][j]!=null)
            return dp[i][j];
        
        
        int up = solve(arr,i-1,j,dp);
        int diag1 = solve(arr,i-1,j+1,dp);
        int diag2 = solve(arr,i-1,j-1,dp);
        
        return dp[i][j] = arr[i][j] + Math.min(up,Math.min(diag1,diag2));
    }
    
    public int minFallingPathSum(int[][] matrix) {
     
        int n = matrix.length;
         Integer[][] dp = new Integer[n][n];
        int min = Integer.MAX_VALUE;
       for(int j=0;j<n;j++){
           min = Math.min(min,solve(matrix,n-1,j,dp));
       }
        return min;
    }
}