class Solution {
    int[][] dirs = {{-1,0},{0,-1},{1,0},{0,1}};
    
    public boolean dfs(int i,int j,int si,String word,char[][] board){
        
        if(si==word.length()) return true;
        
        if(i<0 || i>=board.length || j<0 || j>=board[0].length) return false;
        
        if(word.charAt(si)!=board[i][j])  return false;
        
        char temp = board[i][j];
        board[i][j] = '@';
        
        for(int k=0;k<dirs.length;k++){
            int ni = i+dirs[k][0];
            int nj = j+dirs[k][1];
            
            boolean res = dfs(ni,nj,si+1,word,board);
            if(res==true){
                board[i][j] = temp;
                return true;
            }
        }
         board[i][j] = temp;
        return false;
        
    }
    
    public boolean exist(char[][] board, String word) {
        
        int n = board.length;
        int m = board[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean res = dfs(i,j,0,word,board);
                    if(res==true)
                        return true;
                }
            }
        }
        
        return false;
        
    }
}