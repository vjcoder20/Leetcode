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
    
    public boolean isMatch(String str, String pattern) {
        return solution(str,pattern,0,0);
    }
}