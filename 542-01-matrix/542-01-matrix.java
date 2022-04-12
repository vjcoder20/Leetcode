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
        int[][] ans = new int[arr.length][arr[0].length];
        
        Queue<Pair> q = new ArrayDeque<>();
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    q.add(new Pair(i,j,0));
                }
                else{
                    ans[i][j] = -1;
                }
            }
        }
        int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
        

        
        while(q.size()>0){
            //remove
            Pair rem = q.remove();
            
            //mark and add neighbours
            for(int k=0;k<4;k++){
                int ni = rem.i+dir[k][0];
                int nj = rem.j+dir[k][1];
                
                if(ni>=0 && ni<arr.length && nj>=0 && nj<arr[0].length && ans[ni][nj]==-1){
                    q.add(new Pair(ni,nj,rem.dist+1));
                    ans[ni][nj] = rem.dist+1;
                }
            }
            
        }
        
        return ans;
    }
}