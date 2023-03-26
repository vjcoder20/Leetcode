class Solution {
    public void solve(char[][] board) {
        
        int m = board.length;
        int n = board[0].length;
        
        
        boolean[][] visited = new boolean[m][n];
        int[] rows = {-1,0,1,0};
        int[] cols = {0,-1,0,1};
        
        
        for(int i=0;i<n;i++){
            
            //first row
            if(visited[0][i]==false && board[0][i]=='O')
                dfs(0,i,board,rows,cols,m,n,visited);
            
            //last row
            if(visited[m-1][i]==false && board[m-1][i]=='O')
                 dfs(m-1,i,board,rows,cols,m,n,visited);
            
        }
        
        
        for(int i=0;i<m;i++){
            
            //first column
            if(visited[i][0]==false && board[i][0]=='O')
                dfs(i,0,board,rows,cols,m,n,visited);
            
            //last column
            if(visited[i][n-1]==false && board[i][n-1]=='O')
                 dfs(i,n-1,board,rows,cols,m,n,visited); 
            
        }
        
        
        
        
        for(int i=1;i<m-1;i++){
            for(int j=1;j<n-1;j++){
                if(board[i][j]=='O' && visited[i][j]==false)
                   board[i][j] = 'X';
            }
        }
        
        
    }
    
    public void dfs(int i,int j,char[][] board,int[] rows,int[] cols,int m,int n,boolean[][] visited){
        
        visited[i][j] = true;
        
        for(int k=0;k<4;k++){
            int nr = i+rows[k];
            int nc = j+cols[k];
            
            if(nr>=0 && nr<m && nc>=0 && nc<n && visited[nr][nc]==false && board[nr][nc]=='O')
                dfs(nr,nc,board,rows,cols,m,n,visited);
        }
        
    }
    
    
}