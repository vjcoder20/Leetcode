class Solution {
    public long mostPoints(int[][] questions) {
        long[] dp = new long[questions.length];
        long ans = fun(questions,0,dp);
        return ans;
    }
    public long fun(int[][] questions,int idx,long[] dp){
        if(idx==questions.length-1){
            return questions[idx][0];
        }
        if(idx>=questions.length){
            return 0;
        }
        
        if(dp[idx]!=0){
            return dp[idx];
        }
        
        long f1 = questions[idx][0]+fun(questions,idx+questions[idx][1]+1,dp);
        long f2 = 0+fun(questions,idx+1,dp);
        
        return dp[idx]=Math.max(f1,f2);
    }
}