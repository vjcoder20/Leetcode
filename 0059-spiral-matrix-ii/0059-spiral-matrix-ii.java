class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        
        int rmin = 0;
        int cmin = 0;
        int rmax = n-1;
        int cmax = n-1;
        int counter = 1;
        
        
         while(counter<=n*n){
             //top boundary
            for(int col = cmin;col<=cmax && counter<=n*n;col++){
               arr[rmin][col] = counter;
                counter++;
            }
            rmin++;
            
              //right boundary
            for(int row = rmin;row<=rmax && counter<=n*n;row++){
              arr[row][cmax] = counter;
                counter++;
            }
            cmax--;
            
            
            //bottom boundary
            for(int col = cmax;col>=cmin && counter<=n*n;col--){
              arr[rmax][col] = counter;
                counter++;
            }
            rmax--;
            
            
            //left boundary
            for(int row = rmax;row>=rmin && counter<=n*n;row--){
               arr[row][cmin] = counter;
                counter++;
            }
            cmin++;
        
    }
        
        return arr;
}
}