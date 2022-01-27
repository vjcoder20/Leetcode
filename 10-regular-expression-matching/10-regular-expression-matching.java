class Solution {
    
    //Recursive
    	public boolean solution(String str, String pattern,int i,int j) {
	    
	    if(i==pattern.length()) return j==str.length();
	    
	    if(i+1< pattern.length() && pattern.charAt(i+1)=='*'){
	    if(solution(str,pattern,i+2,j))
	        return true;
	        
	        if(j<str.length() && (pattern.charAt(i) == '.'|| pattern.charAt(i)==str.charAt(j))) {
                if(solution(str,pattern,i,j+1)) {
                    return true;
                }
	        
	    }
	}
	
	    else if(j<str.length() && (pattern.charAt(i) == '.'|| pattern.charAt(i)==str.charAt(j)))
	    return solution(str,pattern,i+1,j+1);
	    
	   
	    return false;
}
    
    //Tabulation
    	public boolean solution(String str, String pattern) {
	
	boolean[][] dp = new boolean[pattern.length()+1][str.length()+1];
	
	for(int i=0;i<dp.length;i++){
	    for(int j=0;j<dp[0].length;j++){
	    
	    
	    if(i==0 && j==0)
	    dp[i][j] = true;
	    
	    else if(i==0){
	        dp[i][j] = false;
	    }
	    
	    else if(j==0){
	        if(pattern.charAt(i-1)=='*')
	        dp[i][j] = dp[i-2][j];
	    }
	    
	    else{
	        
	        if(pattern.charAt(i-1)=='.')
	        dp[i][j] = dp[i-1][j-1];
	        
	        else if(pattern.charAt(i-1)=='*'){
	            dp[i][j] = dp[i-2][j];
	            if(!dp[i][j] && (pattern.charAt(i-2)==str.charAt(j-1) || pattern.charAt(i-2)=='.'))
	            dp[i][j] = dp[i][j-1];
	        }
	        
	        else{
	            if(pattern.charAt(i-1)==str.charAt(j-1))
	            dp[i][j] = dp[i-1][j-1];
	        }
	        
	    }
	    
	        
	    }
	    
	}
	return dp[dp.length-1][dp[0].length-1];
		
		
	}
    
    public boolean isMatch(String str, String pattern) {
        // return solution(str,pattern,0,0); -->Recursive Answer
        return solution(str,pattern);  //--->Tabulation answer
    }
}