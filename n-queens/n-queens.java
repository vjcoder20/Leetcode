class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] chess = new char[n][n];
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess.length;j++){
                chess[i][j] = '.';
            }
        }
         fun(chess,ans,0);
        return ans;
    }
    public void fun(char[][] chess,List<List<String>> ans,int row){
        
          if(row==chess.length){
         ans.add(construct(chess));
            return;
        }
        
        
        for(int col = 0;col<chess.length;col++){
            if(isItSafe(chess,row,col)==true){
                chess[row][col] = 'Q';
                fun(chess,ans,row+1);
                chess[row][col] = '.';
            }
        }
    }
    
     public boolean isItSafe(char chess[][],int row,int col){
        //check for column
        for(int i=row-1;i>=0;i--){
            if(chess[i][col]=='Q'){
                return false;
            }
        }
        
        //diagonal1
        for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        
        //diagonal2
         for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
     public List<String> construct(char[][] chess) {
        List<String> res = new LinkedList<String>();
        for(int i = 0; i < chess.length; i++) {
            String s = new String(chess[i]);
            res.add(s);
        }
        return res;
    }
}
