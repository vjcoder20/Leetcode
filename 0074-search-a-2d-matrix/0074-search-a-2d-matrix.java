class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row = 0;
        int col = n-1;
        
        while(row<m && col>-1){
            
            if(target==matrix[row][col])
                return true;
            
            else if(target<matrix[row][col])
                col--;
            
            else
                row++;
            
        }
        
        return false;
        
    }
}