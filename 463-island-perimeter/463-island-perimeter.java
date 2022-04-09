class Solution {
    public int islandPerimeter(int[][] grid) {
        int nbr = 0;  //neighbour
        int land = 0;  
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    land++;
                    if(i>0 && grid[i-1][j]==1) nbr++; //count left nbr
                    if(j<grid[i].length-1 && grid[i][j+1]==1) nbr++; //count down nbr
                }
            }
        }
        
        return 4*land-2*nbr;
    }
}