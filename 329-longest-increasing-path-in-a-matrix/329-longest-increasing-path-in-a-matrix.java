class Solution {
    int max = 0;
    int length = 0;
    public int longestIncreasingPath(int[][] matrix) {
    boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int[][]dir = {{-1,0},{1,0},{0,1},{0,-1}};
        int m = matrix.length,n = matrix[0].length;
        int[][]dp = new int[m][n];
        for(int i = 0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix[0].length;j++){
                int count =     dfs(dp,matrix,i,j,visited,dir);
                max = Math.max(count,max);

            }
        }
        return max;
    }
    public int dfs(int[][]dp,int[][] matrix,int i,int j, boolean[][] visited,int[][]dir){
        
        if(dp[i][j] !=0)
        {
            return dp[i][j];
        }
        visited[i][j] = true;
            length++;
        
        int maxCount = 0;
        int val = matrix[i][j];
        for(int[]d:dir)
        {
            int r = i+d[0];
            int c = j+d[1];
            if(r<0||c<0||c>=matrix[0].length||r>=matrix.length||visited[r][c]==true||matrix[r][c]>=val){
                continue;
            }
            int count = dfs(dp,matrix,r,c,visited,dir);
            maxCount = Math.max(maxCount,count);
        }
        visited[i][j] = false;
        
        
        return dp[i][j] = maxCount+1;
    }
}