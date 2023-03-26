class Solution {
    
    static class Pair{
        int x;
        int y;
        int t;
        
        Pair(int x,int y,int t){
            this.x = x;
            this.y = y;
            this.t = t;
        }
        
    }
    
    public int orangesRotting(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        
        
        int[][] arr = new int[m][n];
        int count = 0;
        
        Queue<Pair> q = new ArrayDeque<>();
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    arr[i][j] = 2;
                    q.add(new Pair(i,j,0));
                }
                
                else if(grid[i][j]==1)
                    count++;
            }
        }
        
        
        int[] rows = {-1,0,1,0};
        int[] cols = {0,-1,0,1};
        
        int time = 0;
        
        
        while(q.size()!=0){
            
            Pair rem = q.remove();
            time = Math.max(time,rem.t);
            
            for(int i=0;i<4;i++){
                
                int nrow = rem.x+rows[i];
                int ncol = rem.y+cols[i];
                
            if((nrow>=0 && nrow<m) && (ncol>=0 && ncol<n) && arr[nrow][ncol]!=2 && grid[nrow][ncol]==1){
               q.add(new Pair(nrow,ncol,rem.t+1));
                arr[nrow][ncol] = 2;
                count--;
            }
                
            }
            
        }
        
        
        
        if(count!=0)  return -1;
        return time;
        
        
    }
}