class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] dp = new int[m][n];
        for(int[] a:dp)
            Arrays.fill(a,-1);
        return solve(arr,0,0,dp);
    }
    
    public int solve(int[][] arr,int row,int col,int[][] dp){
        if(row==arr.length-1 && col==arr[0].length-1 && arr[row][col]!=1)
            return 1;
        
        else if(row>=arr.length || col>=arr[0].length || arr[row][col]==1)
            return 0;
        
        if(dp[row][col]!=-1)
            return dp[row][col];
        
        arr[row][col] = 1;
        
        int down = solve(arr,row+1,col,dp);
        int right = solve(arr,row,col+1,dp);
        
        arr[row][col] = 0;
        
        return dp[row][col]=down+right;
        
    }
    
}