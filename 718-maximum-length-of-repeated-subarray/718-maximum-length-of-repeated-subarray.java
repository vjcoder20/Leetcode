class Solution {
  
    public int findLength(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        
          int[][] dp = new int[n+1][m+1];
          int max = 0;
        
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    if(arr1[i-1]==arr2[j-1]){
                        dp[i][j] = 1+dp[i-1][j-1];
                        max = Math.max(max,dp[i][j]);
                    }
                    else
                    dp[i][j] = 0;
                }
            }
        
        return max;
    }
}