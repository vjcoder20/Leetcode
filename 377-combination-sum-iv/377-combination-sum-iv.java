class Solution {
    
    public int memoization(int[] nums,int target,Integer[] dp){
          if(target == 0)return 1;
        
        if(target < 0)return 0;
        
        if(dp[target]!=null)
            return dp[target];
        
        int res = 0;
        for(int i = 0;i<nums.length;i++){
            res += memoization(nums,target-nums[i],dp);
        }
        return dp[target]=res;
    }
    
    public int combinationSum4(int[] nums, int target) {
       return memoization(nums,target,new Integer[target+1]);
    }
}