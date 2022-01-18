class Solution {
    public String longestPalindrome(String str) {
         boolean[][] dp = new boolean[str.length()][str.length()];
        StringBuilder sb = new StringBuilder();
      
     for(int gap=0;gap<dp.length;gap++){
    for(int si=0,ei=gap;ei<dp.length;si++,ei++){
        if(gap==0){
            dp[si][ei] = true;
        }
        else if(gap==1){
            if(str.charAt(si)==str.charAt(ei)){
                dp[si][ei] = true;
            }
        }
            else{
                if(str.charAt(si)==str.charAt(ei))
                dp[si][ei] = dp[si+1][ei-1];
            }
            if(dp[si][ei]==true){
                int i = si;
                int j = ei;
                if(sb.length()<=gap){
                  sb = new StringBuilder();
                     while(i<=j){
                  sb.append(str.charAt(i));
                      i++;
              }
                }
                }
            }
        }
    
        
       return sb.toString();
    }
}