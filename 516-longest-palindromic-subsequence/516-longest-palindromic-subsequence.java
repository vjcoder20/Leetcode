class Solution {
    /*Memoization
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
        */
    //Tabulation  
    public int longestPalindromeSubseq(String str) {
          int[][] dp = new int[str.length()][str.length()];
        
        for(int gap=0;gap<dp.length;gap++){
            
            for(int si=0,ei=gap;ei<dp.length;si++,ei++){
                if(gap==0)
                dp[si][ei] = 1;
                
                else if(gap==1)
                dp[si][ei] = str.charAt(si)==str.charAt(ei)?2:1;
            
            else{
                if(str.charAt(si)==str.charAt(ei))
                dp[si][ei] = 2+dp[si+1][ei-1];
                else
                dp[si][ei] = Math.max(dp[si][ei-1],dp[si+1][ei]);
            }
        }
        }
       return dp[0][dp.length-1];
    }
    }
