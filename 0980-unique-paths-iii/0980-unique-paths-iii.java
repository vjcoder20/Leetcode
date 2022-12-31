class Solution {
    int paths = 0;
    public int uniquePathsIII(int[][] grid) {
        boolean[][] visited = new  boolean[grid.length][grid[0].length];
        int s = -1;
        int e = -1;
        int zero = 0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                   s = i;
                   e = j;
                }
                
                if(grid[i][j]==0)
                    zero++;
            }
                
        }
        dfs(grid,s,e,zero,visited);
        return paths;
    }
    
    
    public void dfs(int[][] grid,int i,int j,int zero,boolean[][] visited){
        
        
        
    if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || visited[i][j]==true || grid[i][j]==-1)
            return;
        
        
        if(grid[i][j]==2 && zero==-1)
            paths++;
        
        visited[i][j] = true;
        zero--;
        
        dfs(grid,i-1,j,zero,visited);
        dfs(grid,i,j-1,zero,visited);
        dfs(grid,i+1,j,zero,visited);
        dfs(grid,i,j+1,zero,visited);
        
        visited[i][j] = false;
        zero++;
    }
    
}