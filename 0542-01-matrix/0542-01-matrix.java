class Solution {
    
    static class Pair{
        
        int i;
        int j;
        int dist;
        
        Pair(int i,int j,int dist){
            this.i = i;
            this.j = j;
            this.dist = dist;
        }
        
    }
    
    public int[][] updateMatrix(int[][] arr) {
        
        Queue<Pair> q = new ArrayDeque<>();
        int m = arr.length;
        int n = arr[0].length;
        
        int[][] ans = new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0)
                    q.add(new Pair(i,j,0));
                else
                ans[i][j] = -1;
            }
        }
        
        int[] rows = {-1,0,1,0};
        int[] cols = {0,-1,0,1};
        
        while(q.size()>0){
            
            Pair rem = q.remove();
            
            for(int i=0;i<4;i++){
                int nr = rem.i+rows[i];
                int nc = rem.j+cols[i];
                
                if(nr>=0 && nr<m && nc>=0 && nc<n && ans[nr][nc]==-1){
                    q.add(new Pair(nr,nc,rem.dist+1));
                    ans[nr][nc] = rem.dist+1;
                }
                
            }
            
        }
        
        
        
        return ans;
        
    }
}