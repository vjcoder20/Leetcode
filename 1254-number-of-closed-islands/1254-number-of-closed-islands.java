class Solution {
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[] rows = {-1,0,1,0};
        int[] cols = {0,-1,0,1};
        
        int ans = 0;
        
        for(int i=1;i<m-1;i++){
            for(int j=1;j<n-1;j++){
                if(grid[i][j]==0){
                    if(dfs(i,j,grid,rows,cols))
                        ans++;
                }
                
            }
        }
        
        
        return ans;
        
        
    }
    
    public boolean dfs(int i,int j,int[][] grid,int[] rows,int[] cols){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length)
            return false;
        
        if(grid[i][j]==1)
            return true;
            
        grid[i][j] = 1;
        
        boolean res = true;
        
        for(int k=0;k<4;k++){
            int nr = i+rows[k];
            int nc = j+cols[k];
            res = res & dfs(nr,nc,grid,rows,cols);
        }
        
        return res;
    }
}