class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /* In worst case this will give O(m+n) tc
        int row = 0;
        int col = matrix[0].length-1;
        
        while(row<matrix.length && col>=0){
            if(matrix[row][col]>target){
                col--;
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else
            return true;
        }
        
        return false;
        */
        // Using binary search it gives O(log n + log m) tc
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int low = 0;
        int high = rows*cols-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
   
            //Idea behind this intutuion is imagine this whole 2d array into 1d array and now apply binary search into 1d array but how to get element address into 2d array while imagining into 1d array so for this purpose below 2 lines are taking care of so do dry run for this approach
            
            int row = mid/cols;
            int col = mid%cols;
            
            if(matrix[row][col]>target){
                high = mid-1;
            }
            
            else if(matrix[row][col]<target){
                low = mid+1;
            }
            
            else
            return true;
           
        }
        return false;
    }
}