class Solution {
    public int lengthOfLIS(int[] arr) {
         int[] dp = new int[arr.length];
      dp[0] = 1;
      int ans = 0;
      
      for(int i=1;i<dp.length;i++){
          int val = arr[i];
          int max = 0;
          for(int j=0;j<i;j++){
              if(arr[j]<val){
                  max = Math.max(max,dp[j]);
              }
          }
          dp[i] = max+1;
      }
      
      for(int i=0;i<dp.length;i++){
          ans = Math.max(ans,dp[i]);
      }
      
     return ans;
    }
}