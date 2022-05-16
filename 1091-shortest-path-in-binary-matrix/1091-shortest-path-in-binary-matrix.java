class Solution {
    static class Pair{
        int x;
        int y;
        
        Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1){
            return -1;
        }
        int levels = 1;
        Queue<Pair> q = new ArrayDeque<>();
        grid[0][0] = 1;
        
        q.add(new Pair(0,0));
        
        int[][] dirs = {{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1}};
       
        while(q.size()>0){
            int size = q.size();
           
            while(size-->0){

            Pair rp = q.remove();
                if(rp.x==n-1 && rp.y==n-1)
                    return levels;
                
            for(int k=0;k<dirs.length;k++){
            int nx = rp.x+dirs[k][0];
            int ny = rp.y+dirs[k][1];
                
                
           if(nx>=0 && nx<n && ny>=0 && ny<n && grid[nx][ny]==0){
              q.add(new Pair(nx,ny));
               grid[nx][ny]=1;
            }  
                
            }
           
        }
             levels++;
        } 
        return -1;
    }
}