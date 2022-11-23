class Solution {

    public boolean dfs(int i, int j, char[][] board) {
        //row check

        for (int row = 0; row < 9; row++) {
            if (row != i) {
                if (board[row][j] == board[i][j]) return false;
            }
        }

        //column check

        for (int col = 0; col < 9; col++) {
            if (col != j) {
                if (board[i][col] == board[i][j]) return false;
            }
        }

        //9 elements window check
        
         int ind = (i/3)*3;
         int jind = (j/3)*3;
      
      for(int row=0;row<3;row++){
          for(int col=0;col<3;col++){
              if(ind+row==i && col+jind==j) continue;
              if(board[ind+row][jind+col]==board[i][j]){
                  return false;
              }
          
      }
      }
        

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    boolean ans = dfs(i, j, board);
                    if (ans == false) return false;
                }
            }
        }

        return true;
    }
}
