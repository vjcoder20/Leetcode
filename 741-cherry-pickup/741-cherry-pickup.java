class Solution {
    	public int Solution(int r1, int c1, int r2,int[][] arr,int[][][] dp) {
	    int n = arr.length;
	    int c2 = r1+c1-r2;
            
	     if(r1>=n || r2>=n || c1>=n || c2>=n || arr[r1][c1]==-1 || arr[r2][c2]==-1){
	        return Integer.MIN_VALUE;
	    }
	    
	     if(r1 == n - 1 && c1 == n - 1)
      return arr[r1][c1];

    
    if(r2 == n - 1 && c2 == n - 1)
      return arr[r2][c2];
            
     if(dp[r1][c1][r2]!=0){
	        return dp[r1][c1][r2];
	    }
	
	    int cc;
	    if(r1==r2 && c1==c2)
	    cc = arr[r1][c1];
	    
	    else
	        cc =arr[r1][c1]+arr[r2][c2];
	    
	    int f1 = Solution(r1,c1+1,r2,arr,dp);
	    int f2 = Solution(r1+1,c1,r2+1,arr,dp);
	    int f3 = Solution(r1+1,c1,r2,arr,dp);
	    int f4 = Solution(r1,c1+1,r2+1,arr,dp);
	    
	    cc+=Math.max(Math.max(f1,f2),Math.max(f3,f4));

		return dp[r1][c1][r2]=cc;
	}
    public int cherryPickup(int[][] arr) {
        int n = arr.length;
        return Math.max(0,Solution(0, 0, 0,arr,new int[n][n][n]));
    }
}