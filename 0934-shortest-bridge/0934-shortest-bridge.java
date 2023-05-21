class Solution {
    static class Pair{
        int i;
        int j;
        int level;
        
        Pair(int i,int j,int level){
            this.i = i;
            this.j = j;
            this.level = level;
        }
    }
    public int shortestBridge(int[][] arr) {
        
        Queue<Pair> q = new ArrayDeque<>();
        boolean flag = true;
        
        for(int i=0;i<arr.length && flag;i++){
            for(int j=0;j<arr.length && flag;j++){
                if(arr[i][j]==1){
                    dfs(arr,i,j,q);
                    flag = false;
                }
            }
        }
        
        int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
       
        while(q.size()>0){
            //remove
            Pair rp = q.remove();
            
            //mark and addition
            for(int k=0;k<4;k++){
                int ni = rp.i+dir[k][0] ;
                int nj = rp.j+dir[k][1];
                
                if(ni>=0 && ni<arr.length && nj>=0 && nj<arr.length){
                    if(arr[ni][nj]==0){
                        arr[ni][nj] = 2;
                        q.add(new Pair(ni,nj,rp.level+1));
                    }
                    else if(arr[ni][nj]==1)
                        return rp.level;
                }
            }
        }
       
      return -1;
        
    }
    
    public void dfs(int[][] arr,int i,int j,Queue<Pair> q){
        
        if(i<0 || i>=arr.length || j<0 || j>=arr.length || arr[i][j]!=1){
            return;
        }
        
        q.add(new Pair(i,j,0));
        arr[i][j] = 2;
        
        dfs(arr,i-1,j,q); //top
        dfs(arr,i,j-1,q); //left
        dfs(arr,i+1,j,q); //down
        dfs(arr,i,j+1,q); //right
        
    }
}