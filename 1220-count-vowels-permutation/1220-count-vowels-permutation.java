class Solution {
    public int countVowelPermutation(int n) {
        long MOD = 1000000007;
        
     long[][] dp = new long[n + 1][5];
        
     for(int i = 0; i < 5; i ++){
            dp[1][i] = 1; 
        }
        
        for(int i = 2; i <= n; i ++){
            dp[i][0] = (dp[i - 1][1] + dp[i - 1][2] + dp[i - 1][4]) % MOD; // 'a' can follow {'e', 'i', 'u'}
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD; // 'e' can follow {'a', 'i'}
            dp[i][2] = (dp[i - 1][1] + dp[i - 1][3]) % MOD; // 'i' can follow {'e', 'o'}
            dp[i][3] = (dp[i - 1][2]) % MOD; // 'o' can follow {'i'}
            dp[i][4] = (dp[i - 1][2] + dp[i - 1][3]) % MOD; // 'u' can follow {'i', 'o'}
        }
      
        
      long ans = 0;
    for(long i:dp[n]){
        ans+=i;
        ans=ans%MOD;
    }
        
        return (int)(ans);
    }
}