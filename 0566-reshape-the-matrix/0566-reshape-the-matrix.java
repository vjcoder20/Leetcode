class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int[][] arr = new int[r][c];
        int n = mat.length;
        int m = mat[0].length;
        
        if(r*c!=m*n){
            return mat;
        }
        
      int l = 0;
      int k = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int val = mat[i][j];
                if(k==c && l+1!=r){
                 l = l+1;
                  k = 0;
                arr[l][k] = val;
                }
                else if(l!=r){
                    arr[l][k] = val;
                }
                k++;
            }
        }
        
        return arr;
        
        
    }
}