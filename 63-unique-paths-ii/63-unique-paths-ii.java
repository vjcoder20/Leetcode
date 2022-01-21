class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j] = 0;
                }
                else if(i==0 && j==0){
                    dp[i][j] = 1;
                }
                else
             dp[i][j] = (i>=1?dp[i-1][j]:0)+(j>=1?dp[i][j-1]:0);
            }
        }
        return dp[m-1][n-1];
    }
     public int getPath(int[][] arr,int sr,int sc,int[][] dp){
          
         if(sr>=0 && sc>=0 && arr[sr][sc]==1){
             return 0;
         }
         
        if(sr==0&&sc==0){
            return 1;
        }
         if(sr<0 || sc<0){
             return 0;
         }
        
        if(dp[sr][sc]!=0){
            return dp[sr][sc];
        }
         
       
        int rowa = getPath(arr,sr-1,sc,dp);
        int cola = getPath(arr,sr,sc-1,dp);
    
        
        dp[sr][sc] = rowa+cola;
        return (rowa+cola);
    }
}