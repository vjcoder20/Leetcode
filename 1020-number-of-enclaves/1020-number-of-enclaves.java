class Solution {
    public int numEnclaves(int[][] grid) {
        
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if((i==0 || i == grid.length-1 || j==0 || j==grid[0].length-1) && (grid[i][j]==1)){
                    dfs(grid,i,j);
                }
            }
        }
        
        int countEnclave = 0;
          for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
              if(grid[i][j]==1)
                  countEnclave++;
                }
            }
        
        return countEnclave;
        
    }
    
      public int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}}; //tldr
    
    public void dfs(int[][] grid,int i,int j){
        
        grid[i][j] = 0;
        
        for(int k=0;k<4;k++){
            int ni = i+dir[k][0];
            int nj = j+dir[k][1];
            
            if(ni>=0 && ni<grid.length && nj>=0 && nj<grid[0].length && grid[ni][nj]==1)
                dfs(grid,ni,nj);
        }
    }
}