class Solution {
    static class Pair{
        int x;
        int y;
        
        Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    public void setZeroes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        
        List<Pair> al = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    al.add(new Pair(i,j));
                }
            }
        }
        
        for(Pair rem:al){
            int row = rem.x;
            int col = rem.y;
            
            for(int i=0;i<n;i++){
                arr[row][i] = 0;
            }
            
            for(int i=0;i<m;i++){
                arr[i][col] = 0;
            }
        }
    }
}