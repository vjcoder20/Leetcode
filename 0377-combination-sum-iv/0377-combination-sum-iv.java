class Solution {
    public int combinationSum4(int[] arr, int target) {
        
        int[] dp = new int[target+1];
        
        dp[0] = 1;
        
        for(int i=1;i<=target;i++){
            for(int j=0;j<arr.length;j++){
                if(i-arr[j]>=0)
                dp[i]+=dp[i-arr[j]];
            }
        }
        
        return dp[target];
        
    }
}