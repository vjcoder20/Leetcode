class Solution {
    public void gameOfLife(int[][] board) {
        
        int[][] arr = new int[board.length][board[0].length];
        
    int[][] dir = {{-1,0},{-1,-1},{0,-1},{1,-1},{1,0},{1,1},{0,1},{-1,1}};
       
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            int live = 0;
            
            for(int k=0;k<8;k++){
                int ni = i+dir[k][0];
                int nj = j+dir[k][1];
                
                if(ni>=0 && ni<board.length && nj>=0 && nj<board[0].length){
                    if(board[ni][nj]==1)
                    live++;
                    
                }
            }
            if(board[i][j]==0){
                if(live==3)
                    arr[i][j] = 1;
            }
            else{
                if(live<2)
                    arr[i][j] = 0;
                
                else if(live>=2 && live<=3)
                    arr[i][j] = 1;
                
            }
        }
    }
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[0].length;j++){
               board[i][j] = arr[i][j];
           }
       }
    }
}