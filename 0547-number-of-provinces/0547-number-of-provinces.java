class Solution {
    public int findCircleNum(int[][] arr) {
        
        boolean[] visited = new boolean[arr.length];
        int count = 0;
        
        for(int i=0;i<arr.length;i++){
            if(visited[i]==false){
                dfs(i,visited,arr);
                count++;
            }
        }
        
        return count;
        
    }
    
    public void dfs(int src,boolean[] visited,int[][] arr){
       
         for(int j=0;j<arr.length;j++){
            if(src==j)
           continue;
            if(arr[src][j]==1 && visited[j]==false){
                visited[j] = true;
                dfs(j,visited,arr);
            }
        }
       
    }
    
}