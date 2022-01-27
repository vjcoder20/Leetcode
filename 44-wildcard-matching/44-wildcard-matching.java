class Solution {
    	public boolean solution(String str, String pattern,int i,int j) {
	    
	    if(i==pattern.length())
	    return j==str.length();
	    
	    if(j==str.length())
	    return (pattern.charAt(i)=='*' && solution(str,pattern,i+1,j));
	    
	     if(pattern.charAt(i) == '*') 
	     return solution(str,pattern,i+1,j) || solution(str,pattern,i,j+1);
	     
	     else if(j<str.length() && (pattern.charAt(i) == str.charAt(j) || pattern.charAt(i) == '?'))
            return solution(str,pattern,i+1,j+1);
            
        return false;
	}
    
    public boolean isMatch(String str, String pattern) {
        //Recursive
        // return solution(str,pattern,0,0);
        
        // Tabulation
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