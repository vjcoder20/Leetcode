class Solution {
    public void rotate(int[][] arr) {
        
        // Firstly we will do transpose
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i; j++){
               int temp = arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i] = temp;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            int left = 0,right = arr.length-1;
            while(left<=right){
                int temp = arr[i][left];
                arr[i][left]= arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
        
        
    }
}