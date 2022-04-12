class Solution {
    public void gameOfLife(int[][] board) {
        /* This method is using O(mn) space
        
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
       */
        //In place where SC is O(1)
        
        /*
        idea: Consider cells with 1,2 as live and 0,3 as dead in current gen.
        So in current generation as per those conditions wherever you want to convert 0 to 1, put 3 & for 1 to 0 put 2, this is how we will never loss the count of live cells.
        */
        
        int[][] dir = {{-1,0},{-1,-1},{0,-1},{1,-1},{1,0},{1,1},{0,1},{-1,1}};
       
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            int live = 0;
            
            for(int k=0;k<8;k++){
                int ni = i+dir[k][0];
                int nj = j+dir[k][1];
                
                if(ni>=0 && ni<board.length && nj>=0 && nj<board[0].length && (board[ni][nj]==1 || board[ni][nj]==2)){
                    live++;
                }
            }
            if(board[i][j]==0 && live==3){
                    board[i][j] = 3;
            }
            else if(board[i][j]==1){
                if(live<2 || live>3)
                    board[i][j] = 2;
            }
        }
    }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==3)
                    board[i][j] = 1;
                
                else if(board[i][j]==2)
                 board[i][j] = 0;   
            }
        }
    }
}