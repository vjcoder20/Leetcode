class Solution {
    public boolean wordBreak(String str, List<String> wordDict) {
    boolean[] dp = new boolean[str.length()+1];
    dp[0] = true;
    for(int i=1;i<dp.length;i++){
     for(int j=i-1;j>=0;j--){
         if(dp[j]==true && wordDict.contains(str.substring(j,i))==true){
             dp[i] = true;
             break;
         }
     }
    }
	return dp[dp.length-1];
    }
}