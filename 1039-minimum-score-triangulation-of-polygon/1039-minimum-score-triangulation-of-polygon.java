class Solution {
    public int minScoreTriangulation(int[] arr) {
         int[][] dp = new int[arr.length][arr.length];
        
        for(int gap=2;gap<arr.length;gap++){
    for(int si=0,ei=gap;ei<arr.length;si++,ei++){
        if(gap==2){
            dp[si][ei] = arr[si]*arr[si+1]*arr[si+2];
        }
        else{
            int min = Integer.MAX_VALUE;
            for(int cp=si+1;cp<ei;cp++){
                int lans = dp[si][cp];
                int rans = dp[cp][ei];
                min = Math.min(min,lans+rans+arr[si]*arr[cp]*arr[ei]);
            }
            dp[si][ei] = min;
        }
    }
}

    return dp[0][arr.length-1];
    }
}