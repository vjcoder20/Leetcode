class Solution {
    public int minCut(String str) {
         boolean[][] dp = new boolean[str.length()][str.length()];
        int[] cut = new int[str.length()];
        cut[0] = 0;
        
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
        }
    }
            
            for(int i=1;i<str.length();i++){
                if(dp[0][i]==true){
                    cut[i] = 0;
                }
                else{
                    cut[i] = Integer.MAX_VALUE;
                    for(int j=i;j>0;j--){
                        if(dp[j][i]==true){
                            cut[i] = Math.min(cut[i],cut[j-1]+1);
                        }
                    }
                }
            }
        
        return cut[str.length()-1];
      
    }
}