class Solution {
    /*Memoization
     public int fun(String str1,String str2,int i,int j,int[][] dp){
        if(i>=str1.length() || j>=str2.length()){
            return 0;
        }
        
        if(dp[i][j]!=0){
            return dp[i][j];
        }
       
        if(str1.charAt(i)==str2.charAt(j)){
        return dp[i][j]=1+fun(str1,str2,i+1,j+1,dp);
        }
        
        else
        return dp[i][j]=Math.max(fun(str1,str2,i+1,j,dp),fun(str1,str2,i,j+1,dp));
     }
    public int longestCommonSubsequence(String str1, String str2) {
         int[][] dp = new int[str1.length()][str2.length()];
        int ans = fun(str1,str2,0,0,dp);
        return ans;
        */
    //Tabulation
          public int longestCommonSubsequence(String str1, String str2) {
         int[][] dp = new int[str1.length()+1][str2.length()+1];
        
        for(int i=dp.length-2;i>=0;i--){
            for(int j=dp[0].length-2;j>=0;j--){
                if(str1.charAt(i)==str2.charAt(j))
                    dp[i][j] = 1+dp[i+1][j+1];
                else
                dp[i][j] = Math.max(dp[i][j+1],dp[i+1][j]);
            }
        }
        return dp[0][0]; 
    }
}