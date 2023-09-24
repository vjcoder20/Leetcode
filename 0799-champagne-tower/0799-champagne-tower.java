class Solution {
    public double champagneTower(int k, int r, int c) {
        double[][] dp = new double[r+1][r+1];
    
    dp[0][0] = k;
    for(int i=0;i<dp.length;i++){
        for(int j=0;j<=i;j++){
            if(dp[i][j]>1.0){
                double spare = dp[i][j]-1.0;
                dp[i][j] = 1.0;
                if(i+1<dp.length){
                dp[i+1][j] += spare/2.0;
                }
                if(i+1<dp.length && j+1<dp.length)
                dp[i+1][j+1] += spare/2.0;
            }
        }
        
       
    }
     return dp[r][c];
    }
}