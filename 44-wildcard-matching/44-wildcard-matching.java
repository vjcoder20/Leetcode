class Solution {
    public boolean isMatch(String str, String pattern) {
        boolean[][] dp = new boolean[pattern.length()+1][str.length()+1];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0)
                    dp[i][j] = true;
                
                else if(i==0)
                dp[i][j] = false;
                
                else if(j==0){
                    if(pattern.charAt(i-1)=='*')
                    dp[i][j] = dp[i-1][j];
                    
                    else
                    dp[i][j] = false;
                }
                
                else{
                    if(pattern.charAt(i-1)=='*')
                        dp[i][j] = dp[i-1][j] || dp[i][j-1];
                    
                    else if(pattern.charAt(i-1)=='?')
                        dp[i][j] = dp[i-1][j-1];
                    
                    else{ //character
                        if(pattern.charAt(i-1)==str.charAt(j-1))
                        dp[i][j] = dp[i-1][j-1];
                        
                        else
                        dp[i][j] = false;
                    }
                }
            }
        }
        
        return dp[dp.length-1][dp[0].length-1];
    }
}