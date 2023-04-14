class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        return dfs(dp,s,0,n-1);
    }
    
    
    public int dfs(int[][] dp,String s,int start,int end){
        
        if(start>end)
            return 0;
        
        if(start==end)
            return 1;
        
        if(dp[start][end]!=0)
            return dp[start][end];
        
        
        if(s.charAt(start)==s.charAt(end))
            return dp[start][end]=2+dfs(dp,s,start+1,end-1);
        
        
        return dp[start][end]=Math.max(dfs(dp,s,start+1,end),dfs(dp,s,start,end-1));
        
    }
    
}