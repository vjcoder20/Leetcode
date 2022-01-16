class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[questions.length];
        // long ans = fun(questions,0,dp);
        dp[n-1] = questions[n-1][0];
        for(int i=n-2;i>=0;i--){
        long f1 = questions[i][0];
        if(i+questions[i][1]+1<n){
            f1+=dp[i+questions[i][1]+1];
        }
        long f2 = dp[i+1];
        dp[i]=Math.max(f1,f2);
        }
       return dp[0];
    }
    
    //Recursive Solution
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
