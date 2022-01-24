class Solution {
    //Memoization
      public int fun(String str,int i,int j,int[][] dp){
        if(i==j){
            return 1;
        }
        
        if(i>j){
            return 0;
        }
        
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        
        if(str.charAt(i)==str.charAt(j))
        return dp[i][j] = 2+fun(str,i+1,j-1,dp);
        else
        return dp[i][j]=Math.max(fun(str,i,j-1,dp),fun(str,i+1,j,dp));
    }
    public int longestPalindromeSubseq(String str) {
          int[][] dp = new int[str.length()][str.length()];
        return fun(str,0,str.length()-1,dp);
    }
}