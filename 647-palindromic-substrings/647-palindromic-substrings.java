class Solution {
    public int countSubstrings(String str) {
          boolean[][] dp = new boolean[str.length()][str.length()];
        
        int ans = 0;
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
                ans++;
            }
        }
    }
        
     return ans;
    }
}