class Solution {
    public int deleteAndEarn(int[] arr) {
        int[] freq = new int[10001];
         int[] dp = new int[10001];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        
        dp[1] = freq[1];
        for(int i=2;i<=10000;i++){
            dp[i] = Math.max(dp[i-1],freq[i]*i+dp[i-2]);
        }
        return dp[10000];
      
    }
}