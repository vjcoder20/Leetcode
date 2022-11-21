class Solution {
    static class Pair {
    int i;
    int j;
        
        
    Pair(int i, int j) {
      this.i = i;
      this.j = j;
    }
        
    }
    
    public int nearestExit(char[][] grid, int[] entrance) {
        
        int level = 0;
        
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(entrance[0],entrance[1]));
        
        grid[entrance[0]][entrance[1]] = '+';
        
        int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}}; 
        
        while(q.size()>0){
            level++;
            int size = q.size();
            
            while(size-->0){
                
                //remove
            Pair rp = q.remove();
                
            for(int k=0;k<4;k++){
                int ni = rp.i+dir[k][0];
                int nj = rp.j+dir[k][1];
                
    if(ni>=0 && ni<grid.length && nj>=0 && nj<grid[0].length && grid[ni][nj]=='.'){
        
        if(ni==0 || nj==0 || ni==grid.length-1 || nj==grid[0].length-1)
            return level;
            
                     q.add(new Pair(ni,nj));
                     grid[ni][nj] = '+';

                 }
                
            }
            
        }
        
        
    }
      return -1;   
}
   
}